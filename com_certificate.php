<?php
$con = mysqli_connect("localhost", "root", "mirim2", "beanstalk");
 
$query = "select * from com_certificate";
 
 
if($result = mysqli_query($con, $query)){
    $row_num = mysqli_num_rows($result);
            
    for($i=0; $i<$row_num; $i++){
        $row = mysqli_fetch_array($result);
        echo "{";
        echo "\"event\":\"$row[event]\", \"name\":\"$row[name]\", \"part\":\"$row[part]\", \"agency\":\"$row[agency]\", 
        \"written_fees\":\"$row[written_fees]\", \"practical_fees\":\"$row[practical_fees]\"";
        
        echo "}";
        if($i<$row_num-1){
            echo ", ";
        }
    }       
}
 
else{
    echo "failed to get data from database.";
}
?>