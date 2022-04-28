<?php
$host="localhost";
$database="sos_dashboard";
$username="root";
$password="";

$sql= "select IdC, IdR, TipoDeSuporte, GrupoSindromico, NivelGravidade from classificada;";

$con= mysqli_connect($host,$username,$password,$database);

$result= mysqli_query($con,$sql);

$response= array();

while($row=mysqli_fetch_array($result)){

  #array_push($response,array("id_classificados"=>$row[0],"niveldisfagia"=>$row[1],
  #"tipoalimento"=>$row[2],"id"=>$row[3],"duracao"=>$row[4],"datahora"=>$row[5]));
  array_push($response,array("IdC"=>$row[0],"IdR"=>$row[1],"TipoDeSuporte"=>$row[2],
  "GrupoSindromico"=>$row[3],"NivelGravidade"=>$row[4]));
}

echo json_encode(array("server_response"=>$response));
mysqli_close($con);

?>
