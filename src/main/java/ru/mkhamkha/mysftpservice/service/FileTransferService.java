package ru.mkhamkha.mysftpservice.service;

public interface FileTransferService {
    boolean uploadFile(String localFilePath, String remoteFilePath);

    boolean downloadFile(String localFilePath, String remoteFilePath);

}