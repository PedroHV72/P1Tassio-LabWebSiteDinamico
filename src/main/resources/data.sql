INSERT INTO categoria(id, imagemSimboloUrl, nome, descricao)
VALUES (1, 'https://i.pinimg.com/280x280_RS/f8/7c/bd/f87cbdcdd70d1e4fa3f6164f50d8e023.jpg', 'Whey', 'Os melhores suplementos do mercado');

INSERT INTO categoria(id, imagemSimboloUrl, nome, descricao)
VALUES (2, 'https://i.pinimg.com/280x280_RS/f8/7c/bd/f87cbdcdd70d1e4fa3f6164f50d8e023.jpg', 'Creatina', '');

INSERT INTO categoria(id, imagemSimboloUrl, nome, descricao)
VALUES (3, 'https://www.dicasdetreino.com.br/wp-content/uploads/2018/02/Entenda-o-que-%C3%A9-o-Durateston-para-que-serve-benef%C3%ADcios-fun%C3%A7%C3%A3o-excesso-efeitos-colaterais-como-tomar.jpg', 'Durateston', 'Bomba');

INSERT INTO produto(id, nome, descricao, fotoUrl, dataCadastro, dataUltimaAtualizacao, valorUnitario)
VALUES (1, 'Cem Por Cento Proteina', 'Totalmente isolado', 'https://www.madrugaosuplementos.com.br/media/catalog/product/cache/1/image/9df78eab33525d08d6e5fb8d27136e95/1/0/100-whey-refil-max-titanium-morango_1_.png', '2021-09-24', CURRENT_TIMESTAMP(), '169.90');

INSERT INTO produto(id, nome, descricao, fotoUrl, dataCadastro, dataUltimaAtualizacao, valorUnitario)
VALUES (2, 'Creatina Pura', 'Totalmente pura', 'https://www.madrugaosuplementos.com.br/media/catalog/product/cache/1/image/9df78eab33525d08d6e5fb8d27136e95/c/r/creatina-100g-max-titanium.png', '2021-09-25', CURRENT_TIMESTAMP(), '49.90');

INSERT INTO produto(id, nome, descricao, fotoUrl, dataCadastro, dataUltimaAtualizacao, valorUnitario)
VALUES (3, 'Hórus', 'O melhor pré treino', 'https://www.madrugaosuplementos.com.br/media/catalog/product/cache/1/image/9df78eab33525d08d6e5fb8d27136e95/p/r/pre-workout-max-titanium-limao-yuzu.png', '2021-09-22', CURRENT_TIMESTAMP(), '89.90');

INSERT INTO produtoCategoria(id, produtoId, categoriaId)
VALUES (1, 1, 2);

INSERT INTO produtoCategoria(id, produtoId, categoriaId)
VALUES (2, 2, 1);

INSERT INTO produtoCategoria(id, produtoId, categoriaId)
VALUES (3, 3, 2);

INSERT INTO tabelaPromocao(id, nome, descricao, dataInicio, dataFim, dataCadastro, dataUltimaAtualizacao)
values (1, 'Promoção Malto', 'Para dar energia no treino', '2021-09-25',  '2021-09-27', '2021-09-23', CURRENT_TIMESTAMP());

INSERT INTO promocaoItem(id, valorPromocao, dataCadastro, dataUltimaAtualizacao, produtoId, promocaoId)
values (1, 22.00, '2021-09-24', CURRENT_TIMESTAMP(), 1, 1);
