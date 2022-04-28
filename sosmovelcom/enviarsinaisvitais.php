<?php
# Arquivo para inserção de dados na tabela tbl_teste
# Criado por Marcos Diógenes em 21/02/2019

# Requisição de funcionalidade do arquivo de conexão
require "init.php";

#Variáveis representando os atributos a serem inseridos na tabela
$u_pa="120/80";//$_POST["pa"];
$u_fc="119";//$_POST["fc"];
$u_fr="24";//$_POST["fr"];
$u_satsemsuport="97";//$_POST["satsemsuport"];
$u_satcomsuport="99";//$_POST["satcomsuport"];
$u_temperatura="33";//$_POST["temperatura"];
$u_hgt="122";//$_POST["hgt"];
$u_glasgow="4";//$_POST["glasgow"];


#Comando de inserção de dados
$sql_query="insert into sinaisvitais (IdV,Pa,Fc,Fr,SatSemSuport,SatComSuport,Temperatura,HGT,Glasgow)
 values(null,'$u_pa','$u_fc','$u_fr','$u_satsemsuport','$u_satcomsuport','$u_temperatura','$u_hgt','$u_glasgow');";

#Teste de sucesso da inserção de dados
if(mysqli_query($connection,$sql_query)){
#  echo " dados inseridos";
}
else {
#  echo " Erro na inserção de dados";
}

?>
