-- V2 - Migrations para adicionar coluna de rank na tabela users

ALTER TABLE tb_users
ADD COLUMN rank VARCHAR(255);