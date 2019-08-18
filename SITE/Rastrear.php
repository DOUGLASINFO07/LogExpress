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
    <td width="31" height="42"><strong><em><img src="Imagens/home.png" width="30" height="30" /></em></strong></td>
    <td width="53"><strong><em>Página Inicial</em></strong></td>
    <td width="32"><strong><em><img src="Imagens/Rel_OrdemEntrega.png" width="30" height="30" /></em></strong></td>
    <td width="76" align="left" valign="middle"><strong><em>Rastrear Mercadoria</em></strong></td>
    <td width="32"><strong><em><img src="Imagens/info.png" width="30" height="30" /></em></strong></td>
    <td width="63" align="left" valign="middle"><strong><em>Conheça Software</em></strong></td>
    <td width="35"><strong><em><img src="Imagens/Rel_funcionario.png" width="30" height="30" /></em></strong></td>
    <td width="53"><strong><em>Área Interna</em></strong></td>
    <td width="30"><strong><em><img src="Imagens/contato.png" width="30" height="30" /></em></strong></td>
    <td width="61"><strong><em>Contatos</em></strong></td>
  </tr>
  <tr>
    <td height="346" colspan="10">
    <HR />
    
    <?php
	
	
	
		include_once("conexaoLogexpress.php");
				
		$nome1 = $_POST["txtNome"];
		$nome2 = $_POST["txtNotaFiscal"];
		
		
		$camposOK = true;
		 //determina se ocorreu erro
     if ($nome1 == ""){
        echo "Informe o CPF ou CNPJ. <BR> ";
        $camposOK = false;
        }
     if ($nome2 == ""){
        echo "Informe o Numero da Nota Fiscal. <BR> ";
        $camposOK = false;
        }
		
	 if ($camposOK){

		$sql = "SELECT c.fantasia, 
		c.cnpj, 
		d.nome,
		d.cnpj, 
		v.placa, 
		v.modelo, 
		oe.codigo, 
		oe.tipomercadoria, 
		oe.quantMercadoria, 
		oe.notafiscal, 
		oe.observacao 
			FROM Clientes c, 
			Destinatario d, 
			Veiculo v, 
			ordemEntrega oe 
				WHERE oe.notaFiscal 
					LIKE '$nome2%' 
						AND d.cnpj
							 LIKE '$nome1%'
								 AND c.codigo = oe.codCliente 
									 AND d.codigo = oe.codDestinatario
									 	AND v.codigo = oe.codVeiculo";
		
		$res = mysql_query ($sql) or die ("ERRO ao pesquisar dados Ordem Entrega.".mysql_error());
		
		$total = mysql_num_rows($res);
		
		while ($dados = mysql_fetch_assoc(($res))){
		
				$nomeCliente = $dados["fantasia"];
				$cnpjCliente = $dados["cnpj"];
				$Veiculo = $dados["modelo"];
				$Placa = $dados["placa"];
				$TipoMercadoria  = $dados["tipomercadoria"];
				$Quantidade = $dados["quantMercadoria"];
				$NotaFiscal = $dados["notafiscal"];
				$Observacao = $dados["observacao"];
				$Destinatario = $dados["nome"];
				$cnpjDestintario = $dados["cnpj"];
				
				echo "NOME DA EMPRESA = $nomeCliente <br>
						CNPJ EMPRESA = $cnpjCliente <br>
				VEICULO DA ENTREGA = $Veiculo <br>
				PLACA VEICULO = $Placa <br>
				TIPO MERCADORIA =  $TipoMercadoria <br>
				QUANTIDADE =  $Quantidade <br>
				NOTA FISCAL =  $NotaFiscal <br>
				DESTINATARIO =  $Destinatario <br>
				CPF / CNPJ DESTINATARIO=  $cnpjDestintario <BR><BR>
				<B>OBSERVACOES <BR><BR>  $Observacao <br>";
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
