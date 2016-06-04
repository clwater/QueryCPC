# 全国省市 JSON查询

   想做一个天气查询的软件,但是需要自己通过地址查询对应的城市(地级市),找了很多,但是没有现成的接口,就自己动手做了一个.
   
   找到了一个xml格式的全国省市区目录和全球所有国家主要城市的文件.
   
   在java中解析了一下,并生成了对应的json格式.
   
   可以通过http://182.254.210.18/QueryCPC/QueryAll.php 获取所有的省级别的列表,(get方式)
            
    {"province":[{"name:","省级别名","province_id" : "id"},[{"name":"北京","province_id" : "0"},{"name":"天津","province_id" : "1"},,....]}
    
    
   通过 http://182.254.210.18/QueryCPC/QueryCity.php?pr=name 将对应省的id替换name作为pr的参数传入(get方式)
       
    {"city":[{"name:","地级市名"},{"name":"沈阳"},{"name":"大连"},...]}
    
   今后会逐渐完善县级市的列表
   
   AnalisicCPC_JAVA 文件夹附所有java文件
   
   LocList.xml 为原文件
   
  
    
  