# 🌎​ AREP-HelloWord

En este ejercicio, creamos una función en **AWS Lambda** usando **Java 8** para calcular el cuadrado de un número. Luego, configuramos **API Gateway** para exponer la función a través de un **API REST**, 
permitiendo invocar el servicio mediante una URL pública con un parámetro numérico como entrada: 


1. Empezamos siguiendo el tutorial, empaquetamos y compilamos el código en VS:

<p align="center"> 
<img width="898" height="481" alt="image" src="https://github.com/user-attachments/assets/bf11f930-a628-4335-a3db-63198e7458f1" />
</p>

2. Entramos a AWS y seleccionamos la opción de Lambda y hacemos las configuraciones correspondientes y cargamos el código:

<p align="center"> 
<img width="1315" height="526" alt="image" src="https://github.com/user-attachments/assets/23003fdc-92f1-4d6a-8a47-51fd6fd1ee85" />
</p>
<p align="center"> 
<img width="700" height="338" alt="image" src="https://github.com/user-attachments/assets/395c09b1-8d0b-4e32-b939-49c5f72ead6e" />
</p>
<p align="center"> 
<img width="1362" height="540" alt="image" src="https://github.com/user-attachments/assets/effe70e9-35a6-4b8e-8e84-78f5332a615f" />
</p>

3. Realizamos la prueba con el número 5 como se nos pide y vemos como funciona con éxito:

<p align="center"> 
<img width="1308" height="529" alt="image" src="https://github.com/user-attachments/assets/32255419-a0ad-4a92-89e1-5742fbcb8d7a" />
</p>

4. Ahora exponemos el Lambda usando API Gateway, seleccionamos API REST, configuamos y creamos los metodos:

<p align="center"> 
<img width="1318" height="220" alt="image" src="https://github.com/user-attachments/assets/c08d1968-3ab6-45b2-a41e-85dcd3ceb211" />
</p>
<p align="center"> 
<img width="898" height="322" alt="image" src="https://github.com/user-attachments/assets/56adb75c-f956-4cf1-bc1a-32bd872d9244" />
</p>

7. Realizamos las pruebas:
<p align="center"> 
<img width="884" height="534" alt="image" src="https://github.com/user-attachments/assets/495f4a87-0866-482a-ab00-a7b9308f66b5" />
</p>
<p align="center"> 
<img width="814" height="462" alt="image" src="https://github.com/user-attachments/assets/79183699-90b8-4ad5-84d2-f0d9361e7878" />
</p>

8. Implementamos el API y probamos con el link **https://xs51nvlbpd.execute-api.us-east-1.amazonaws.com/beta/mathservices/square?value=11**:
<p align="center"> 
<img width="537" height="463" alt="image" src="https://github.com/user-attachments/assets/b3dce9b7-2533-4561-abc0-4522405ec4d4" />
</p>
<p align="center"> 
<img width="807" height="239" alt="image" src="https://github.com/user-attachments/assets/f9926f7f-1b82-4c57-932c-0bc7203075e0" />
</p>

9. Creamos la clase adicional y copilamos de nuevo:
<p align="center"> 
<img width="939" height="277" alt="image" src="https://github.com/user-attachments/assets/2ddd4243-e98d-4f59-9b6e-6a47c0fcb9e9" />
</p>

10. Creamos otra funcion lambda:
<p align="center"> 
<img width="1310" height="539" alt="image" src="https://github.com/user-attachments/assets/8592db57-08e0-4123-983a-34a93496df18" />
</p>
<p align="center"> 
<img width="1351" height="459" alt="image" src="https://github.com/user-attachments/assets/5c29fbe5-b09b-4f2d-a692-5ab6c63a7982" />
</p>
