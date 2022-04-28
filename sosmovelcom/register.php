<?php
# Arquivo para inserção de dados na tabela tbl_teste
# Criado por Marcos Diógenes em 21/02/2019

# Requisição de funcionalidade do arquivo de conexão
require "init.php";

#Variáveis representando os atributos a serem inseridos na tabela
$u_textura_alimento=$_POST["textura_alimento"];
$u_reg_1=$_POST["reg_1"];
$u_informacoes=$_POST["informacoes"];
$u_fk_teste_tbl_classificados=$_POST["fk_teste_tbl_classificados"];


#Comando de inserção de dados
$sql_query="insert into tbl_teste values('','$u_textura_alimento','$u_reg_1',
'$u_informacoes', '$u_fk_teste_tbl_classificados');";

#Teste de sucesso da inserção de dados
if(mysqli_query($connection,$sql_query)){
#  echo " dados inseridos";
}
else {
#  echo " Erro na inserção de dados";
}

?>
