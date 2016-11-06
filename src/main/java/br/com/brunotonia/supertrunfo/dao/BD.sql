DROP TABLE CARRO;

DROP TABLE PILOTO;

CREATE TABLE CARRO (ID SERIAL PRIMARY KEY, 
                    NOME VARCHAR(30) NOT NULL,
                    FABRICANTE VARCHAR(30) NOT NULL,
                    PAIS VARCHAR(30) NOT NULL,
                    POTENCIA DECIMAL NOT NULL,
                    PESO DECIMAL NOT NULL,
                    VMAX DECIMAL NOT NULL,
                    CILINDROS INTEGER NOT NULL,
                    CC INTEGER NOT NULL,
                    ANO INTEGER NOT NULL,
                    IMAGEM VARCHAR(255) NOT NULL);

CREATE TABLE PILOTO (ID SERIAL PRIMARY KEY, 
                    NOME VARCHAR (30) NOT NULL UNIQUE,
                    PAIS VARCHAR(30) NOT NULL,
                    TITULOS INTEGER NOT NULL,
                    CORRIDAS INTEGER NOT NULL,
                    POLES INTEGER NOT NULL,
                    VITORIAS INTEGER NOT NULL);

INSERT INTO CARRO (NOME, FABRICANTE, PAIS, POTENCIA, PESO, VMAX, CILINDROS, CC, ANO, IMAGEM) VALUES ('919 HYBRID', 'PORSCHE', 'ALEMANHA', 900.0, 875.0, 340.2, 4, 2000, 2015, '/home/bruno/Projetos/NetBeans/TP2 - SuperTrunfo/src/resources/imagens/Porsche919.png');
INSERT INTO CARRO (NOME, FABRICANTE, PAIS, POTENCIA, PESO, VMAX, CILINDROS, CC, ANO, IMAGEM) VALUES ('F1', 'MCLAREN', 'INGLATERRA', 618.0, 1138.0, 390.7, 12, 6100, 1992, '/home/bruno/Projetos/NetBeans/TP2 - SuperTrunfo/src/resources/imagens/McLarenF1.png');
INSERT INTO CARRO (NOME, FABRICANTE, PAIS, POTENCIA, PESO, VMAX, CILINDROS, CC, ANO, IMAGEM) VALUES ('VULCAN', 'ASTON MARTIN', 'INGLATERRA', 800.0, 1350.0, 360.0, 12, 7000, 2015, '/home/bruno/Projetos/NetBeans/TP2 - SuperTrunfo/src/resources/imagens/AMVulcan.jpg');
INSERT INTO CARRO (NOME, FABRICANTE, PAIS, POTENCIA, PESO, VMAX, CILINDROS, CC, ANO, IMAGEM) VALUES ('CHIRON', 'BUGATTI', 'FRANÇA', 1479.0, 1995.8, 420.0, 16, 8000, 2016, '/home/bruno/Projetos/NetBeans/TP2 - SuperTrunfo/src/resources/imagens/BugattiChiron.jpg');
INSERT INTO CARRO (NOME, FABRICANTE, PAIS, POTENCIA, PESO, VMAX, CILINDROS, CC, ANO, IMAGEM) VALUES ('ONE:1', 'KOENIGSEGG', 'SUÉCIA', 1360.0, 1360.0, 453.0, 8, 5000, 2014, '/home/bruno/Projetos/NetBeans/TP2 - SuperTrunfo/src/resources/imagens/KoenigseggOne1.jpg');
INSERT INTO CARRO (NOME, FABRICANTE, PAIS, POTENCIA, PESO, VMAX, CILINDROS, CC, ANO, IMAGEM) VALUES ('LA FERRARI', 'FERRARI', 'ITÁLIA', 800.0, 1585.0, 349.0, 12, 3800, 2013, '/home/bruno/Projetos/NetBeans/TP2 - SuperTrunfo/src/resources/imagens/LaFerrari.jpg');
INSERT INTO CARRO (NOME, FABRICANTE, PAIS, POTENCIA, PESO, VMAX, CILINDROS, CC, ANO, IMAGEM) VALUES ('GT-R R35', 'NISSAN', 'JAPÂO', 485.0, 1736.0, 315.0, 6, 6300, 2008, '/home/bruno/Projetos/NetBeans/TP2 - SuperTrunfo/src/resources/imagens/NissanGTR.jpg');
INSERT INTO CARRO (NOME, FABRICANTE, PAIS, POTENCIA, PESO, VMAX, CILINDROS, CC, ANO, IMAGEM) VALUES ('ZONDA CINQUE', 'PAGANI', 'ITÁLIA', 678.0, 1210.0, 350.0, 12, 7200, 2008, '/home/bruno/Projetos/NetBeans/TP2 - SuperTrunfo/src/resources/imagens/PaganiZonda.jpg');
INSERT INTO CARRO (NOME, FABRICANTE, PAIS, POTENCIA, PESO, VMAX, CILINDROS, CC, ANO, IMAGEM) VALUES ('CAMARO SS', 'CHEVROLET', 'EUA', 406.0, 1570.0, 249.0, 8, 6200, 2009, '/home/bruno/Projetos/NetBeans/TP2 - SuperTrunfo/src/resources/imagens/CamaroSS.jpg');
INSERT INTO CARRO (NOME, FABRICANTE, PAIS, POTENCIA, PESO, VMAX, CILINDROS, CC, ANO, IMAGEM) VALUES ('R8', 'AUDI', 'ALEMANHA', 540.0, 1560.0, 316.0, 10, 5200, 2003, '/home/bruno/Projetos/NetBeans/TP2 - SuperTrunfo/src/resources/imagens/AudiR8.jpg');
INSERT INTO CARRO (NOME, FABRICANTE, PAIS, POTENCIA, PESO, VMAX, CILINDROS, CC, ANO, IMAGEM) VALUES ('MARAUDER', 'PARAMOUNT', 'AFRICA DO SUL', 1138.0, 9900.0, 120.0, 4, 5900, 2008, '/home/bruno/Projetos/NetBeans/TP2 - SuperTrunfo/src/resources/imagens/Marauder.png');
INSERT INTO CARRO (NOME, FABRICANTE, PAIS, POTENCIA, PESO, VMAX, CILINDROS, CC, ANO, IMAGEM) VALUES ('PORSHE 911 CARRERA SS', 'PORSCHE', 'ALEMANHA',210, 900, 340.2, 4, 2808, 1973, '/home/bruno/Projetos/NetBeans/TP2 - SuperTrunfo/src/resources/imagens/74carrera.jpg');
INSERT INTO CARRO (NOME, FABRICANTE, PAIS, POTENCIA, PESO, VMAX, CILINDROS, CC, ANO, IMAGEM) VALUES ('207', 'PEUGEOT', 'FRANÇA', 73.0, 1295.0, 170.0, 4, 1360, 2006, '/home/bruno/Projetos/NetBeans/TP2 - SuperTrunfo/src/resources/imagens/207.jpg');
INSERT INTO CARRO (NOME, FABRICANTE, PAIS, POTENCIA, PESO, VMAX, CILINDROS, CC, ANO, IMAGEM) VALUES ('CHALLENGER', 'DODGE', 'EUA', 240.0, 1462.0, 180.0, 6, 5573, 1974, '/home/bruno/Projetos/NetBeans/TP2 - SuperTrunfo/src/resources/imagens/charger.jpg');
INSERT INTO CARRO (NOME, FABRICANTE, PAIS, POTENCIA, PESO, VMAX, CILINDROS, CC, ANO, IMAGEM) VALUES ('EE-17 SUCURI I', 'ENGESA', 'BRASIL', 295, 18500, 110, 6, 5212, 1970, '/home/bruno/Projetos/NetBeans/TP2 - SuperTrunfo/src/resources/imagens/sucuri.jpg');

INSERT INTO PILOTO (NOME, PAIS, TITULOS, CORRIDAS, POLES, VITORIAS) VALUES ('Ayrton Senna', 'Brasil', 3, 162, 65, 41);
INSERT INTO PILOTO (NOME, PAIS, TITULOS, CORRIDAS, POLES, VITORIAS) VALUES ('Michael Schumacher', 'Germany', 7, 308, 68, 91);