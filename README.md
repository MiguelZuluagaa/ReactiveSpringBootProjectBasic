
# SpringBoot (Programacion Reactiva) + MongoDB + Docker 

Esto es un crud basico usando programacion reactiva con SpringBoot y MongoDB


## Deployment

Para ejecutar este proyecto primero necesitaras tener algun Engine de docker corriendo en tu maquina, y parandote en la raiz de este proyecto con una terminal, deberas ejecutar el siguiente comando

``` bash
  docker-compose up
```





## API Reference - Port 8080

#### Get all products

``` http
  GET /product
```

#### Get product

``` http
  GET /product/${id}
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `id`      | `string` | **Required**. Id of product to fetch |

#### Save product

```http
  POST /product
```

##### You must send the following parameters in the request body
| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `name`    | `string` | **Required**. Name of product to save |
| `quantity`| `int`    | **Required**. Quantity of product to save |
| `price`   | `double` | **Required**. Price of product to save |

#### Edit product

```http
  PUT /product/{id}
```

##### You must send the following parameters in the request body
| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `id`    | `string` | **Required**. Id of product to edit |
| `name`    | `string` |  Name of product to edit |
| `quantity`| `int`    |  Quantity of product to edit |
| `price`   | `double` |  Price of product to edit |

#### Delete product

```http
  DELETE /product/{id}
```

##### You must send the following parameters in the request body
| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `id`    | `string` | **Required**. Id of product to delete |

