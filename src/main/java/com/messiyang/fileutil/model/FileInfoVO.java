package com.messiyang.fileutil.model;

import lombok.Data;

/**
 * 文件信息
 * @author messiyang
 */
@Data
public class FileInfoVO extends FileInfo {

    public FileInfoVO(FileInfo fileInfo) {
        this.setId(fileInfo.getId());
        this.setFileName(fileInfo.getFileName());
        this.setFileExt(fileInfo.getFileExt());
        this.setFilePath(fileInfo.getFilePath());
        this.setCreateTime(fileInfo.getCreateTime());
        this.setCreateType(fileInfo.getCreateType());
        this.setCreatorId(fileInfo.getCreatorId());
        this.setCreatorName(fileInfo.getCreatorName());
        this.setRegister(fileInfo.isRegister());
        this.setRegisterMemo(fileInfo.getRegisterMemo());
        this.setRegisterTime(fileInfo.getRegisterTime());
    }
    private byte[] fileData;
}
