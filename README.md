# How to make a request body polymorphism

This project is used to demostrate how to apply a flexible data structure to request body and process it on **Java Spring Restful API.**

## Example
In this example, we have two birds like **Parrot** and **HummingBird** and they are extended from **Bird** class. Once user submit data to API, depend on what kind of bird its data structure may difference. However, from API, we just need a Bird class to receive these kind of birds and base on configuration we defined by annotation in **Bird** class, Java will produce a correct instance we want.

Bird's JSON data like:
```
{
	"name": "green PARRoT",
	"type": "PARROT",
	"words": ["Em oi", "Honney"]
}
```
Just use **Postman** and make a POST request with body as above and send to ```localhost:8080/test_bird```. You will get a message: **"Received a parrot"**

And HummingBird JSON data like:
```
{
	"name": "Beautiful Bird",
	"type": "HUMMING",
	"favoriteFlower": "Sun Flower"
}
```
You will get a message: **"Received a hummingBird"**.

## Authors

* **Vu Van Tran** - *Initial work* - [Vu Van Tran](https://github.com/vuvantran)
