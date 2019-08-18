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
    <td height="346" colspan="10" >
    <HR />
    
    <?php
	
	
	
		include_once("conexaoLogexpress.php");
				
		$observacoes = $_POST["txtobservacao"];
		
		$camposOK = true;

     if ($observacoes == ""){
        echo "Informe os dados que deseja Atualizar!!. <BR> ";
        $camposOK = false;
        }
		
	 if ($camposOK){
		 
		 $sql = "SELECT * FROM ordemEntrega	WHERE observacao LIKE '$observacoes%' 
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
				$cnpjDestintario = $dados["cnpj"];}
		 

		$sql = "UPDATE ordemEntrega SET observacao = '$observacoes' "; 
		
		$res = mysql_query ($sql) or die ("ERRO ao Atualizar dados Ordem Entrega.".mysql_error());
		
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
