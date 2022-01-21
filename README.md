# ⚡ Lightning API ⚡

This API has been built with the objective of showing the lightnings that are falling in the world in real time.

## Languages and Framework 💻

### Kotlin & SpringBoot
<a href="https://kotlinlang.org" target="_blank" rel="noreferrer"> <img src="https://www.vectorlogo.zone/logos/kotlinlang/kotlinlang-icon.svg" alt="kotlin" width="32" height="32"/> </a> 
<a href="https://spring.io/" target="_blank" rel="noreferrer"> <img src="https://www.vectorlogo.zone/logos/springio/springio-icon.svg" alt="spring" width="32" height="32"/> </a> </p>

## How does to request that API? 🤷‍

###Let's begin 
To simulate an application we strongly recommend to use <a href="https://www.postman.com/downloads/" target="_blank">Postman</a> it's a powerful tool to test this kind of applications.

###URL address 

This API has been deployed on Google Cloud Platform. Below it is the API url address: 

```` shell
wss://ws-lightning-oficial-v7b7p4ee4q-nn.a.run.app/ws-lightning
````

To begin after connected you have to send the message <b>'Activate SOS Collection'</b> to the server for start to receive the lightnings information

```` shell
Activate SOS Collection
````

###A Postman sample:

####Connecting
![](../../nasa_lighting/readme_assets/postman_001.png)

####After connected sending the message
![](../../nasa_lighting/readme_assets/postman_002.png)

####Response
![](../../nasa_lighting/readme_assets/postman_003.png)

###The Response

Lets get open the response json: 

```` json lines
{
    "time": 1642729723,
    "strokes": [
        {
            "time": 1642729663167,
            "lat": -15.27459,
            "lon": 170.733001,
            "power": 951
        },
        {
            "time": 1642729663167,
            "lat": -15.27459,
            "lon": 170.733001,
            "power": 517
        }
    ]
}
````
<br/>
<h3>Main node</h3>

- ```` json
  "time" : long
  ```` 
  General time (Timestamp)
- ```` json
  "strokes" : Array
  ```` 
  List of strokes

<br/>
<h3>Stroke</h3>

- ```` json
  "time" : long
  ```` 
  The timestamp of stroke
- ```` json
  "lat" : double
  ```` 
  Latitude of stroke 
- ```` json
  "lon" : double
  ```` 
  Longitude of stroke 
- ```` json
  "power" : Int
  ```` 
  Power of stroke 