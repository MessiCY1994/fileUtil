package com.messiyang.fileutil.dao;


import com.messiyang.fileutil.model.FileInfo;
import org.springframework.stereotype.Repository;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Repository
public interface FileMapper {

    int deleteByPrimaryKey(String id);

    int insert(FileInfo record);

    FileInfo getById(String id);

    List<FileInfo> selectByIds(@Param("ids") String[] ids);

    int updateByPrimaryKey(FileInfo record);

}