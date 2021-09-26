CREATE TABLE categoria(
      id                  INT            NOT NULL,
      ImagemSimboloUrl    VARCHAR (1000),
      nome                VARCHAR (40)   NOT NULL,
      descricao           VARCHAR (300)
);

CREATE TABLE produto (
      id                        INT           NOT NULL,
      nome                      VARCHAR(40)   NOT NULL,
      descricao                 VARCHAR(300),
      fotoUrl                   VARCHAR(1000),
      dataCadastro              DATE,
      dataUltimaAtualizacao     TIMESTAMP     NOT NULL,
      valorUnitario             FLOAT(5.2)
);

CREATE TABLE produtoCategoria (
      id           INT NOT NULL,
      produtoId    INT NOT NULL,
      categoriaId  INT NOT NULL,

      FOREIGN KEY (categoriaId) REFERENCES categoria(id),
      FOREIGN KEY (produtoId)   REFERENCES produto(id)
);