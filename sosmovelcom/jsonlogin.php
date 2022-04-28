<?php
$host="localhost";
$database="sos_dashboard";
$username="root";
$password="";

$u_NomeUsuario = $_POST["NomeUsuario"];
$u_Placa = $_POST["Placa"];

$sql= "select CNH, CPFM, CPFE, CPFA, idG from umsa where NomeUsuario = '$u_NomeUsuario' and Placa = '$u_Placa';";

$con= mysqli_connect($host,$username,$password,$database);

$result= mysqli_query($con,$sql);

$response= array();

while($row=mysqli_fetch_array($result)){

  #array_push($response,array("id_classificados"=>$row[0],"niveldisfagia"=>$row[1],
  #"tipoalimento"=>$row[2],"id"=>$row[3],"duracao"=>$row[4],"datahora"=>$row[5]));
  array_push($response,array("CNH"=>$row[0],"CPFM"=>$row[1],
  "CPFE"=>$row[2],"CPFA"=>$row[3],"idG"=>$row[4]));
}

echo json_encode(array("server_response"=>$response));
mysqli_close($con);

?>
