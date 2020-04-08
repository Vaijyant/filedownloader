package com.file.downloader.controller;

import com.file.downloader.service.FileDownloaderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("${application.baseUrl}")
public class AppController {

    @Autowired
    FileDownloaderService fileDownloaderService;

    @GetMapping(value = "/filedownloader")
    public String fileDownloader(@RequestParam(value = "downloadPath", required = false) String downloadPath) {
        return fileDownloaderService.test();
    }

}