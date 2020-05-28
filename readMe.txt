    POST:
    http://localhost:9090/flux/products
    {
        "id": null,
        "name": "Item-103",
        "category": "Category-3",
        "price":100.0
    }

    GET:
    http://localhost:9090/flux/products

    GET:
    http://localhost:9090/flux/products/stream

    PUT:
    http://localhost:9090/flux/products
    {
        "id": "5ecf65096e6f713d8b331e52",
        "name": "Item-102",
        "category": "Category-2",
        "price": 600.0
    }

    DELETE:
    http://localhost:9090/flux/products/5eca3879e35cde0a1888c875
