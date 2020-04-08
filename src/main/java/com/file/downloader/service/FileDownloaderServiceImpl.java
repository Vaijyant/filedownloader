package com.file.downloader.service;

import org.springframework.stereotype.Service;

@Service
public class FileDownloaderServiceImpl implements FileDownloaderService {

    @Override
    public String test() {
        return "Inside Service";
    }
}
