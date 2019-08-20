       <?php
          //PASSO 1 - conectar ao banco de dados
         $conexao = mysql_connect("localhost", "root", "") or die ("Não foi possível conectar ao banco de dados." . mysql_error());
          
          //PASSO 2 - selecionar o banco de dados
          $BancoDados = mysql_select_db("logexpress") or die ("Não foi possível encontrar o banco." . mysql_error());
       
       ?>