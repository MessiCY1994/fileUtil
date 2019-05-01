# fileUtil
可用于本地文件上传和下载和fastdfs上的文件上传下载。具体参数在FileServiceImpl修改fileStoreService参数（可以为fastDFSStoreServiceImpl或者localStoreFileService）

# 本地上传
1:在application.yml中修改
file:
  local:
    root: 本地路径
2:然后在FileServiceImpl中把 
    @Resource(name="localStoreFileService")
    private FileStoreService fileStoreService;
就可以开始本地上传和下载操作


# fastdfs上传下载
1:修改fdfs_client.conf 
connect_timeout = 60
network_timeout = 60
charset = UTF-8
http.tracker_http_port = 808

tracker_server = ip:22122

2:在application.yml中修改
#文件服务器地址
trackerPort: :8080/
trackerServer: ip
trackerProtocol: http://

3:在FileServiceImpl中修改
@Resource(name="fastDFSStoreServiceImpl")
private FileStoreService fileStoreService;


本demo包含两个上传下载方式（本地和fastdfs）
