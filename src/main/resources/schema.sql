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