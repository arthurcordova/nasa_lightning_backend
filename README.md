# ⚡ Lightning API ⚡

This API has been built with the objective of showing the lightnings that are falling in the world in real time.

## Languages and Framework 💻

### Kotlin & SpringBoot
<a href="https://kotlinlang.org" target="_blank" rel="noreferrer"> <img src="https://www.vectorlogo.zone/logos/kotlinlang/kotlinlang-icon.svg" alt="kotlin" width="32" height="32"/> </a> 
<a href="https://spring.io/" target="_blank" rel="noreferrer"> <img src="https://www.vectorlogo.zone/logos/springio/springio-icon.svg" alt="spring" width="32" height="32"/> </a> </p>

<h2> How does to request that API? 🤷</h2>

<h3>Let's begin<h3/> 
To simulate an application we strongly recommend to use <a href="https://www.postman.com/downloads/" target="_blank">Postman</a> it's a powerful tool to test this kind of applications.

<h3>URL address</h3> 

This API has been deployed on Google Cloud Platform. Below it is the API url address: 

```` shell
wss://ws-lightning-oficial-v7b7p4ee4q-nn.a.run.app/ws-lightning
````

To begin after connected you have to send the message <b>'Activate SOS Collection'</b> to the server for start to receive the lightnings information

```` shell
Activate SOS Collection
````

<h2>A Postman sample:</h2>

<h3>Connecting</h3>

<a href="https://github.com/arthurcordova/nasa_lightning_backend/blob/master/readme_assets/postman_001.png" target="_blank" rel="noreferrer"> <img src="https://github.com/arthurcordova/nasa_lightning_backend/blob/master/readme_assets/postman_001.png" alt="kotlin" width="500" height="300"/> </a>

<h3>After connected sending the message</h3>
<a href="https://github.com/arthurcordova/nasa_lightning_backend/blob/master/readme_assets/postman_002.png" target="_blank" rel="noreferrer"> <img src="https://github.com/arthurcordova/nasa_lightning_backend/blob/master/readme_assets/postman_002.png" alt="kotlin" width="500" height="300"/> </a>

<h3>Response</h3>
<a href="https://github.com/arthurcordova/nasa_lightning_backend/blob/master/readme_assets/postman_003.png" target="_blank" rel="noreferrer"> <img src="https://github.com/arthurcordova/nasa_lightning_backend/blob/master/readme_assets/postman_003.png" alt="kotlin" width="500" height="300"/> </a>

<h3>The Response</h3>

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