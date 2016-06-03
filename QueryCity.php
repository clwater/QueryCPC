
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<?php
//header("Content-Type:text/html;charset=gb2312");

$city = $_GET['pr'];
$file = $city."".".txt";
$file = "city/"."".$file;
$myfile = fopen($file, "r") or die("Unable to open file!");
echo fread($myfile,filesize($file));
fclose($myfile);
?>
