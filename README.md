# Back-end - Trabalho Final JAVA

> **Aluno:** Hugo Vinicius Reis Vaz

> **E-mail:** hugo.desenvolvimento@outlook.com  

> **Git Projeto:** https://github.com/javaHugoLib/blogpucjee

# Cenário:

 Implementar um backend para um serviço de um blog, em que haverá AUTOR e POSTAGEM.
- O autor terá um CRUD de postagens.
- Usuários poderão acessar as postagens por ordem cronológica ou por autor.
- O usuário poderá adicionar COMENTARIO à postagem. Os comentários seguirão ordem cronológica.

## Installation

To run tests:  

```sh
mvn test
```

To start application:  

```sh
mvn -Dmaven.test.skip=true wildfly:run
```
## Autor

http://localhost:8080/blogpucjee/rest/autor/all

      curl -X GET \
      http://localhost:8080/blogpucjee/rest/autor/all

Retorno

    [
        {
            "id": 1,
            "nome": "Hugo Vinicius",
            "postagens": [
                {
                    "id": 1,
                    "titulo": "titulo Post 1 autor Hugo",
                    "postagem": "Conteudo do post 1  autor Hugo",
                    "listComentarioEntity": [
                        {
                            "id": 1,
                            "comentario": "Coment 1 do post 1",
                            "nomeAutorCriador": "Jose",
                            "data": 1573850561938
                        },
                        {
                            "id": 11,
                            "comentario": "Coment 2 do post 2",
                            "nomeAutorCriador": "Jose",
                            "data": 1573850562001
                        }
                    ]
                }
            ]
        }
    ]

 

http://localhost:8080/blogpucjee/rest/autor/2

    curl -X GET \
              http://localhost:8080/blogpucjee/rest/autor/1 \
 Retorno

         {
            "id": 2,
            "nome": "Layssa Morgara",
            "postagens": [
                {
                    "id": 4,
                    "titulo": "titulo Post 1 autor Layssa",
                    "postagem": "Conteudo do post 1  autor Layssa",
                    "listComentarioEntity": [
                        {
                            "id": 4,
                            "comentario": "Coment 1 do post 4",
                            "nomeAutorCriador": "Daniel",
                            "data": 1573853069202
                        }
                    ]
                },
                {
                    "id": 5,
                    "titulo": "titulo Post 2 autor Layssa",
                    "postagem": "Conteudo do post 2  autor Layssa",
                    "listComentarioEntity": [
                        {
                            "id": 5,
                            "comentario": "Coment 1 do post 5",
                            "nomeAutorCriador": "Luiz",
                            "data": 1573853069204
                        }
                    ]
                }
        ]
    }

 http://localhost:8080/blogpucjee/rest/autor/delete

    curl -X DELETE \
      http://localhost:8080/blogpucjee/rest/autor/delete \
Retorno

    204 No Content

http://localhost:8080/blogpucjee/rest/autor/create

    curl -X POST \
      http://localhost:8080/blogpucjee/rest/autor/create \

Corpo:

    {
    	"nome": "Layssa Morgara"
    }

Retorno

    {
        "id": 15,
        "nome": "Layssa Morgara"
    }

http://localhost:8080/blogpucjee/rest/autor/update

    curl -X PUT \
      http://localhost:8080/blogpucjee/rest/autor/update \
Corpo

    {
        "id": 4,
        "nome": "Novo Nome"
    }

http://localhost:8080/blogpucjee/rest/autor/1/postagens

    curl -X GET \
      http://localhost:8080/blogpucjee/rest/autor/1/postagens \
Retorno

    [
        {
            "id": 1,
            "titulo": "titulo Post 1 autor Hugo",
            "postagem": "Conteudo do post 1  autor Hugo",
            "listComentarioEntity": [
                {
                    "id": 1,
                    "comentario": "Coment 1 do post 1",
                    "nomeAutorCriador": "Jose",
                    "data": 1573853069199
                },
                {
                    "id": 11,
                    "comentario": "Coment 2 do post 2",
                    "nomeAutorCriador": "Jose",
                    "data": 1573853069207
                }
            ]
        },
        {
            "id": 2,
            "titulo": "titulo Post 2 autor Hugo",
            "postagem": "Conteudo do post 2  autor Hugo",
            "listComentarioEntity": [
                {
                    "id": 2,
                    "comentario": "Coment 1 do post 2",
                    "nomeAutorCriador": "Maria",
                    "data": 1573853069201
                }
            ]
        },
        {
            "id": 3,
            "titulo": "titulo Post 3 autor Hugo",
            "postagem": "Conteudo do post 3  autor Hugo",
            "listComentarioEntity": [
                {
                    "id": 3,
                    "comentario": "Coment 1 do post 3",
                    "nomeAutorCriador": "Calos",
                    "data": 1573853069201
                }
            ]
        }
    ]

## Postagem

http://localhost:8080/blogpucjee/rest/postagem/all

    curl -X GET \
      http://localhost:8080/blogpucjee/rest/postagem/all \
Retorno

    [
        {
            "id": 1,
            "titulo": "titulo Post 1 autor Hugo",
            "postagem": "Conteudo do post 1  autor Hugo",
            "listComentarioEntity": [
                {
                    "id": 1,
                    "comentario": "Coment 1 do post 1",
                    "nomeAutorCriador": "Jose",
                    "data": 1573853069199
                },
                {
                    "id": 11,
                    "comentario": "Coment 2 do post 2",
                    "nomeAutorCriador": "Jose",
                    "data": 1573853069207
                }
            ]
        },
        {
            "id": 2,
            "titulo": "titulo Post 2 autor Hugo",
            "postagem": "Conteudo do post 2  autor Hugo",
            "listComentarioEntity": [
                {
                    "id": 2,
                    "comentario": "Coment 1 do post 2",
                    "nomeAutorCriador": "Maria",
                    "data": 1573853069201
                }
            ]
        },
        {
            "id": 3,
            "titulo": "titulo Post 3 autor Hugo",
            "postagem": "Conteudo do post 3  autor Hugo",
            "listComentarioEntity": [
                {
                    "id": 3,
                    "comentario": "Coment 1 do post 3",
                    "nomeAutorCriador": "Calos",
                    "data": 1573853069201
                }
            ]
        },
        {
            "id": 4,
            "titulo": "titulo Post 1 autor Layssa",
            "postagem": "Conteudo do post 1  autor Layssa",
            "listComentarioEntity": [
                {
                    "id": 4,
                    "comentario": "Coment 1 do post 4",
                    "nomeAutorCriador": "Daniel",
                    "data": 1573853069202
                }
            ]
        },
        {
            "id": 5,
            "titulo": "titulo Post 2 autor Layssa",
            "postagem": "Conteudo do post 2  autor Layssa",
            "listComentarioEntity": [
                {
                    "id": 5,
                    "comentario": "Coment 1 do post 5",
                    "nomeAutorCriador": "Luiz",
                    "data": 1573853069204
                }
            ]
        },
        {
            "id": 6,
            "titulo": "titulo Post 1 autor Malu",
            "postagem": "Conteudo do post 1  autor Malu",
            "listComentarioEntity": [
                {
                    "id": 6,
                    "comentario": "Coment 1 do post 6",
                    "nomeAutorCriador": "Tereza",
                    "data": 1573853069205
                }
            ]
        },
        {
            "id": 7,
            "titulo": "titulo Post 2  autor Malu",
            "postagem": "Conteudo do post 2 autor Malu",
            "listComentarioEntity": [
                {
                    "id": 7,
                    "comentario": "Coment 1 do post 7",
                    "nomeAutorCriador": "Alberto",
                    "data": 1573853069205
                }
            ]
        },
        {
            "id": 8,
            "titulo": "titulo Post 1 autor BS",
            "postagem": "Conteudo do post 1  autor BS",
            "listComentarioEntity": [
                {
                    "id": 8,
                    "comentario": "Coment 1 do post 8",
                    "nomeAutorCriador": "Joubert",
                    "data": 1573853069206
                }
            ]
        },
        {
            "id": 9,
            "titulo": "titulo Post 2 autor BS",
            "postagem": "Conteudo do post 2  autor BS",
            "listComentarioEntity": [
                {
                    "id": 9,
                    "comentario": "Coment 1 do post 9",
                    "nomeAutorCriador": "Solange",
                    "data": 1573853069206
                }
            ]
        },
        {
            "id": 10,
            "titulo": "titulo Post 3 autor BS",
            "postagem": "Conteudo do post 3  autor BS",
            "listComentarioEntity": [
                {
                    "id": 10,
                    "comentario": "Coment 1 do post 10",
                    "nomeAutorCriador": "Arildo",
                    "data": 1573853069207
                }
            ]
        }
    ]

http://localhost:8080/blogpucjee/rest/postagem/1

    curl -X GET \
      http://localhost:8080/blogpucjee/rest/postagem/1 \
Retorno

    {
        "id": 1,
        "titulo": "titulo Post 1 autor Hugo",
        "postagem": "Conteudo do post 1  autor Hugo",
        "listComentarioEntity": [
            {
                "id": 1,
                "comentario": "Coment 1 do post 1",
                "nomeAutorCriador": "Jose",
                "data": 1573853069199
            },
            {
                "id": 11,
                "comentario": "Coment 2 do post 2",
                "nomeAutorCriador": "Jose",
                "data": 1573853069207
            }
        ]
    }

http://localhost:8080/blogpucjee/rest/postagem/delete

    curl -X DELETE \
      http://localhost:8080/blogpucjee/rest/postagem/delete \

Corpo:

    {
            "id": 1,
            "titulo": "titulo Post 1 autor Hugo",
            "postagem": "Conteudo do post 1  autor Hugo",
            "listComentarioEntity": [
                {
                    "id": 1,
                    "comentario": "Coment 1 do post 1",
                    "nomeAutorCriador": "Jose",
                    "data": 1573847277651
                }
            ]
    }

http://localhost:8080/blogpucjee/rest/postagem/create

    curl -X POST \
      http://localhost:8080/blogpucjee/rest/postagem/create \


http://localhost:8080/blogpucjee/rest/autor/update

    curl -X PUT \
      http://localhost:8080/blogpucjee/rest/autor/update \

## Comentário

http://localhost:8080/blogpucjee/rest/comentario/all

    curl -X GET \
      http://localhost:8080/blogpucjee/rest/comentario/all \

http://localhost:8080/blogpucjee/rest/comentario/1

    curl -X GET \
      http://localhost:8080/blogpucjee/rest/comentario/1 \

http://localhost:8080/blogpucjee/rest/comentario/delete

    curl -X DELETE \
      http://localhost:8080/blogpucjee/rest/comentario/delete \

http://localhost:8080/blogpucjee/rest/comentario/create

    curl -X POST \
      http://localhost:8080/blogpucjee/rest/comentario/create \

http://localhost:8080/blogpucjee/rest/comentario/update

    curl -X PUT \
      http://localhost:8080/blogpucjee/rest/comentario/update \
