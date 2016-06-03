<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<?php
$myfile = fopen("province.txt", "r") or die("Unable to open file!");
echo fread($myfile,filesize("province.txt"));
fclose($myfile);
?>
