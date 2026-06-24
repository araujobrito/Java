CREATE TABLE clientes (
                          id int NOT NULL AUTO_INCREMENT,
                          razao_social varchar(255) NOT NULL,
                          cnpj varchar(18) NOT NULL,
                          nome_responsavel varchar(255) NOT NULL,
                          email varchar(255) NOT NULL,
                          senha varchar(255) NOT NULL,
                          telefone varchar(20) NOT NULL,
                          PRIMARY KEY (id)
);