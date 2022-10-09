package Utilities;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipUtils {
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy MM dd HH:mm/");
    LocalDateTime now = LocalDateTime.now();

    private List <String> fileList;
    private static final String OUTPUT_ZIP_FILE = "Screen_Capture_Result.zip";
    private static final String OUTPUT_ZIP_FILE_SUREFIRE_RPT = "Surefire_Reports.zip";

    private static final String SOURCE_FOLDER = System.getProperty("user.dir") +"/Screen_Capture_Result"; // SourceFolder path
    private static final String SUREFIRE_SOURCE_FOLDER = System.getProperty("user.dir") +"/target/surefire-reports"; // SourceFolder path



    public ZipUtils() {
        fileList = new ArrayList < String > ();
    }

    public static void creatZipFile() {
        ZipUtils appZip = new ZipUtils();
        appZip.generateFileList(new File(SOURCE_FOLDER,SUREFIRE_SOURCE_FOLDER));
        appZip.zipIt(OUTPUT_ZIP_FILE);
        appZip.zipIt(OUTPUT_ZIP_FILE_SUREFIRE_RPT);
    }

    public void zipIt(String zipFile) {
        byte[] buffer = new byte[1024];
        String source = new File(SOURCE_FOLDER).getName();
        String source_surefire = new File(SUREFIRE_SOURCE_FOLDER).getName();
        FileOutputStream fos = null;
        ZipOutputStream zos = null;
        try {
            fos = new FileOutputStream(zipFile);
            zos = new ZipOutputStream(fos);

            FileInputStream in = null;

            for (String file: this.fileList) {
                ZipEntry ze = new ZipEntry(source + File.separator + file);
                zos.putNextEntry(ze);
                try {
                    in = new FileInputStream(SOURCE_FOLDER + File.separator + file);
                    in = new FileInputStream(SUREFIRE_SOURCE_FOLDER + File.separator + file);
                    int len;
                    while ((len = in .read(buffer)) > 0) {
                        zos.write(buffer, 0, len);
                    }
                } finally {
                    in.close();
                }
            }

            zos.closeEntry();

        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            try {
                zos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void generateFileList(File node) {
        // add file only
        if (node.isFile()) {
            fileList.add(generateZipEntry1(node.toString()));
            fileList.add(generateZipEntry2(node.toString()));
        }

        if (node.isDirectory()) {
            String[] subNote = node.list();
            for (String filename: subNote) {
                generateFileList(new File(node, filename));
            }
        }
    }

    private String generateZipEntry1(String file) {
        return file.substring(SOURCE_FOLDER.length() + 1, file.length());

    }
    private String generateZipEntry2(String file) {
        return file.substring(SUREFIRE_SOURCE_FOLDER.length() + 1, file.length());

    }
}