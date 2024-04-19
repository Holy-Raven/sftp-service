package ru.mkhamkha.mysftpservice;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import ru.mkhamkha.mysftpservice.service.FileTransferService;

@Component
public class TestSftpFileTransfer implements CommandLineRunner {

    @Autowired
    private FileTransferService fileTransferService;

    private Logger logger = LoggerFactory.getLogger(TestSftpFileTransfer.class);

    @Override
    public void run(String... args) throws Exception {

        logger.info("Start upload file");
        boolean isUploaded = fileTransferService.uploadFile("src/main/resources/file/data.txt", "upload/data.txt");
        logger.info("Upload result: " + String.valueOf(isUploaded));

        logger.info("Start download file");
        boolean isDownloaded = fileTransferService.downloadFile("src/main/resources/file/data.txt", "upload/data.txt");
        logger.info("Download result: " + String.valueOf(isDownloaded));
    }

}