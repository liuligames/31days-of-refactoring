package com.liuli.day15removeduplication.solution;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class MedicalRecord {
    private LocalDateTime dateArchived;

    private boolean isArchived;

    public void archiveRecord() {
        switchToArchive();
    }

    public void closeRecord() {
        switchToArchive();
    }

    public void switchToArchive() {
        this.dateArchived = LocalDateTime.now();
        this.isArchived = true;
    }

}
