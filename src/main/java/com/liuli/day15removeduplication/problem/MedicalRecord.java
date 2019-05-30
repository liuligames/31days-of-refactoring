package com.liuli.day15removeduplication.problem;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class MedicalRecord {
    private LocalDateTime dateArchived;

    private boolean isArchived;

    public void archiveRecord() {
        this.dateArchived = LocalDateTime.now();
        this.isArchived = true;
    }

    public void closeRecord() {
        this.dateArchived = LocalDateTime.now();
        this.isArchived = true;
    }
}
