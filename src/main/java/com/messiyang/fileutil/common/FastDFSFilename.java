package com.messiyang.fileutil.common;

import lombok.Data;

@Data
public class FastDFSFilename {
    /**
     * group名称
     */
    private String groupName;
    /**
     * 除group外的名称
     */
    private String filename;
}
