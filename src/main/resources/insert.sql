insert into AUTOR (id, nome) values (1, 'Hugo Vinicius');
insert into AUTOR (id, nome) values (2, 'Layssa Morgara');
insert into AUTOR (id, nome) values (3, 'Maria Lu�sa');
insert into AUTOR (id, nome) values (4, 'Boneca Sandrinha');
 call next value for SE_AUTOR;
 call next value for SE_AUTOR;
 call next value for SE_AUTOR;
 call next value for SE_AUTOR;
insert into POSTAGEM (id, titulo, postagem, autor_id) values (1, 'titulo Post 1 autor Hugo', 'Conteudo do post 1  autor Hugo', 1);
insert into POSTAGEM (id, titulo, postagem, autor_id) values (2, 'titulo Post 2 autor Hugo', 'Conteudo do post 2  autor Hugo', 1);
insert into POSTAGEM (id, titulo, postagem, autor_id) values (3, 'titulo Post 3 autor Hugo', 'Conteudo do post 3  autor Hugo', 1);
insert into POSTAGEM (id, titulo, postagem, autor_id) values (4, 'titulo Post 1 autor Layssa', 'Conteudo do post 1  autor Layssa', 2);
insert into POSTAGEM (id, titulo, postagem, autor_id) values (5, 'titulo Post 2 autor Layssa', 'Conteudo do post 2  autor Layssa', 2);
insert into POSTAGEM (id, titulo, postagem, autor_id) values (6, 'titulo Post 1 autor Malu', 'Conteudo do post 1  autor Malu', 3);
insert into POSTAGEM (id, titulo, postagem, autor_id) values (7, 'titulo Post 2  autor Malu', 'Conteudo do post 2 autor Malu', 3);
insert into POSTAGEM (id, titulo, postagem, autor_id) values (8, 'titulo Post 1 autor BS', 'Conteudo do post 1  autor BS', 4);
insert into POSTAGEM (id, titulo, postagem, autor_id) values (9, 'titulo Post 2 autor BS', 'Conteudo do post 2  autor BS', 4);
insert into POSTAGEM (id, titulo, postagem, autor_id) values (10, 'titulo Post 3 autor BS', 'Conteudo do post 3  autor BS', 4);
 call next value for SE_POSTAGEM;
 call next value for SE_POSTAGEM;
 call next value for SE_POSTAGEM;
 call next value for SE_POSTAGEM;
 call next value for SE_POSTAGEM; 
 call next value for SE_POSTAGEM;
 call next value for SE_POSTAGEM;
 call next value for SE_POSTAGEM; 
 call next value for SE_POSTAGEM;
 call next value for SE_POSTAGEM;
insert into COMENTARIO (id, comentario, nomeAutorCriador, data, postagem_id) values (1, 'Coment 1 do post 1', 'Jose', CURRENT_TIMESTAMP, 1);
insert into COMENTARIO (id, comentario, nomeAutorCriador, data, postagem_id) values (2, 'Coment 1 do post 2', 'Maria', CURRENT_TIMESTAMP, 2);
insert into COMENTARIO (id, comentario, nomeAutorCriador, data, postagem_id) values (3, 'Coment 1 do post 3', 'Calos', CURRENT_TIMESTAMP, 3);
insert into COMENTARIO (id, comentario, nomeAutorCriador, data, postagem_id) values (4, 'Coment 1 do post 4', 'Daniel', CURRENT_TIMESTAMP, 4);
insert into COMENTARIO (id, comentario, nomeAutorCriador, data, postagem_id) values (5, 'Coment 1 do post 5', 'Luiz', CURRENT_TIMESTAMP, 5);
insert into COMENTARIO (id, comentario, nomeAutorCriador, data, postagem_id) values (6, 'Coment 1 do post 6', 'Tereza', CURRENT_TIMESTAMP, 6);
insert into COMENTARIO (id, comentario, nomeAutorCriador, data, postagem_id) values (7, 'Coment 1 do post 7', 'Alberto', CURRENT_TIMESTAMP, 7);
insert into COMENTARIO (id, comentario, nomeAutorCriador, data, postagem_id) values (8, 'Coment 1 do post 8', 'Joubert', CURRENT_TIMESTAMP, 8);
insert into COMENTARIO (id, comentario, nomeAutorCriador, data, postagem_id) values (9, 'Coment 1 do post 9', 'Solange', CURRENT_TIMESTAMP, 9);
insert into COMENTARIO (id, comentario, nomeAutorCriador, data, postagem_id) values (10, 'Coment 1 do post 10', 'Arildo', CURRENT_TIMESTAMP, 10);
insert into COMENTARIO (id, comentario, nomeAutorCriador, data, postagem_id) values (11, 'Coment 2 do post 2', 'Jose', CURRENT_TIMESTAMP, 1);
 call next value for SE_COMENTARIO;
 call next value for SE_COMENTARIO;
 call next value for SE_COMENTARIO;
 call next value for SE_COMENTARIO;
 call next value for SE_COMENTARIO;
 call next value for SE_COMENTARIO;
 call next value for SE_COMENTARIO;
 call next value for SE_COMENTARIO;
 call next value for SE_COMENTARIO;
 call next value for SE_COMENTARIO;
 call next value for SE_COMENTARIO; 