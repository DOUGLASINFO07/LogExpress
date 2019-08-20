<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>LogExpress</title>
<link href="Estilo.css" rel="stylesheet" type="text/css" />
</head>

<body><center>
<table width="487" height="583" border="0">
  <tr>
    <td colspan="11" align="center"><img src="Imagens/LogoLogExpress1.png" width="500" height="160" /></td>
  </tr>
  <tr align="center">
    <td width="31" height="42"><strong><em><a href="index.html"><img src="Imagens/home.png" width="30" height="30" /></a></em></strong></td>
    <td width="53"><strong><em>Página Inicial</em></strong></td>
    <td width="32"><strong><em><a href="Rastrear.html"><img src="Imagens/Rel_OrdemEntrega.png" width="30" height="30" /></a></em></strong></td>
    <td width="76" align="left" valign="middle"><strong><em>Rastrear Mercadoria</em></strong></td>
    <td width="32"><strong><em><a href="Software.html"><img src="Imagens/info.png" width="30" height="30" /></a></em></strong></td>
    <td width="63" align="left" valign="middle"><strong><em>Conheça Software</em></strong></td>
    <td width="35"><strong><em><a href="Interno.html"><img src="Imagens/Rel_funcionario.png" width="30" height="30" /></a></em></strong></td>
    <td width="53"><strong><em>Área Interna</em></strong></td>
    <td width="30"><strong><em><a href="Contatos.html"><img src="Imagens/contato.png" width="30" height="30" /></a></em></strong></td>
    <td width="61"><strong><em>Contatos</em></strong></td>
  </tr>
  <tr>
    <td height="346" colspan="10">
    <HR />
    
    <p>
      <?php
	
		include_once("conexaoLogexpress.php");
				
		$login = $_POST["txtLogin"];
		$senha = $_POST["txtSenha"];
		

		$sql = "SELECT * FROM login WHERE nome LIKE '$login%'";

		$res = mysql_query ($sql) or die ("ERRO ao pesquisar dados Ordem Entrega.".mysql_error());
		
		$total = mysql_num_rows($res);
		
		while ($dados = mysql_fetch_assoc(($res))){
		
				$login1 = $dados["nome"];
				$senha1 = $dados["senha"];
				
				
				$camposOK = true; //determina se ocorreu erro
     if ($login != "$login1" or $login == ""){
        echo "Nome de Login Incorreto. <BR> ";
        $camposOK = false;
        }
     if ($senha != "$senha1" or $senha == ""){
        echo "Senha Incorreta!!  Digite uma senha Válida!!. <BR> ";
        $camposOK = false;
        }
		 
		 if ($camposOK == true){
	echo 
		
		"<H2>ATUALIZAR NOTA FISCAL</H2>
<BR />
 <form id='form1' name='form1' method='post' 
      action='http://localhost/Site/Atualizar.php'>
	  
	  
<em><strong>NOTA FISCAL</strong></em>
<input name='txtnotaFiscal' type='text' /><br /><BR />
<em><strong>ATUALIZAR RASTREAMENTO</strong></em>
<input name='txtobservacao' type='text' size=80/><br /><BR />
  <input type='submit' name='enviar' id='enviar' value='ATUALIZAR' /><br /><BR />
  
  </form>";
		 }
		}		
		
	
		
	?>

   

    <HR />   
    </td>
  </tr>
  <tr bgcolor="#D06505" align="center">
    <td colspan="10"><em><strong>Trabalho interdisciplinar desenvolvido por Douglas, Robson e Ênio</strong></em></td>
  </tr>
</table>
</center>
</body>
</html>
