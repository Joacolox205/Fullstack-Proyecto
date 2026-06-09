# 🏗️ **Fullstack Proyecto - Microservicios**

Repositorio centralizado para todos los microservicios del proyecto Fullstack.

---

## 📦 **Microservicios Disponibles**

### **1. EurekaServer** 🌐
- **Puerto:** `8761`
- **URL Dashboard:** `http://localhost:8761`
- **Descripción:** Servidor de descubrimiento de microservicios (Service Registry)
- **Carpeta:** `/EurekaServer`

**Ejecutar:**
```bash
cd EurekaServer
mvn spring-boot:run
```

---

### **2. Reembolsos** 💰
- **Puerto:** `8085`
- **Base de datos:** `reembolsos_db`
- **Descripción:** Gestión de reembolsos de empleados
- **Carpeta:** `/Reembolsos`
- **Endpoints:**
  - `GET /api/v1/reembolsos`
  - `POST /api/v1/reembolsos`
  - `PUT /api/v1/reembolsos/{id}`
  - `DELETE /api/v1/reembolsos/{id}`

**Ejecutar:**
```bash
cd Reembolsos
mvn spring-boot:run
```

---

### **3. Remuneraciones** 💵
- **Puerto:** `8088`
- **Base de datos:** `remuneraciones_db`
- **Descripción:** Gestión de remuneraciones y salarios
- **Carpeta:** `/Remuneraciones`
- **Endpoints:**
  - `GET /api/v1/remuneraciones`
  - `POST /api/v1/remuneraciones`
  - `PUT /api/v1/remuneraciones/{id}`
  - `DELETE /api/v1/remuneraciones/{id}`

**Ejecutar:**
```bash
cd Remuneraciones
mvn spring-boot:run
```

---

### **4. Usuario** 👤
- **Carpeta:** `/Usuario`
- **Descripción:** Gestión de usuarios del sistema
- **Estado:** [Configurar según tus especificaciones]

---

### **5. Producto** 📦
- **Carpeta:** `/Producto`
- **Descripción:** Catálogo y gestión de productos
- **Estado:** [Configurar según tus especificaciones]

---

### **6. Búsqueda** 🔍
- **Carpeta:** `/Busqueda`
- **Descripción:** Motor de búsqueda de productos/servicios
- **Estado:** [Configurar según tus especificaciones]

---

### **7. Notificaciones** 📧
- **Carpeta:** `/Notificaciones`
- **Descripción:** Sistema de notificaciones y alertas
- **Estado:** [Configurar según tus especificaciones]

---

## 🚀 **Inicio Rápido**

### **1. Requisitos**
- ✅ Java 17+
- ✅ Maven 3.9+
- ✅ MySQL 8.0+
- ✅ XAMPP (para desarrollo local)

### **2. Configuración de Base de Datos**

Abrir phpMyAdmin: `http://localhost/phpmyadmin`

```sql
-- Reembolsos
CREATE DATABASE reembolsos_db CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;

-- Remuneraciones
CREATE DATABASE remuneraciones_db CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;
```

### **3. Orden de Ejecución**

```bash
# Terminal 1 - Eureka Server
cd EurekaServer
mvn spring-boot:run
# Espera a que inicie en puerto 8761

# Terminal 2 - Reembolsos
cd Reembolsos
mvn spring-boot:run
# Puerto 8085

# Terminal 3 - Remuneraciones
cd Remuneraciones
mvn spring-boot:run
# Puerto 8088

# Terminal 4+ - Otros microservicios
# Continúa con Usuario, Producto, Busqueda, Notificaciones
```

### **4. Verificar que todo está funcionando**

Abre el dashboard de Eureka:
```
http://localhost:8761
```

Deberías ver:
- ✅ REEMBOLSOS-SERVICE (puerto 8085)
- ✅ REMUNERACIONES-SERVICE (puerto 8088)
- ✅ [Otros microservicios registrados]

---

## 🔗 **Puertos de Microservicios**

| Servicio | Puerto | URL |
|----------|--------|-----|
| Eureka Server | 8761 | http://localhost:8761 |
| Reembolsos | 8085 | http://localhost:8085/api/v1/reembolsos |
| Remuneraciones | 8088 | http://localhost:8088/api/v1/remuneraciones |
| Usuario | 8086 | http://localhost:8086 |
| Producto | 8087 | http://localhost:8087 |
| Búsqueda | 8089 | http://localhost:8089 |
| Notificaciones | 8090 | http://localhost:8090 |

---

## 📝 **Configuración Eureka en cada Microservicio**

### **En `pom.xml`**
```xml
<dependency>
    <groupId>org.springframework.cloud</groupId>
    <artifactId>spring-cloud-starter-netflix-eureka-client</artifactId>
</dependency>
```

### **En `application.properties`**
```properties
spring.application.name=reembolsos-service
eureka.client.service-url.defaultZone=http://localhost:8761/eureka/
eureka.client.register-with-eureka=true
eureka.client.fetch-registry=true
```

---

## 🧪 **Testing con Postman/Insomnia**

### **Reembolsos**
```bash
GET http://localhost:8085/api/v1/reembolsos

POST http://localhost:8085/api/v1/reembolsos
Body:
{
  "nombreReembolso": "Viaje",
  "monto": 5000,
  "fecha": "2026-05-12",
  "estado": "Pendiente",
  "descripcion": "Reembolso por viaje"
}
```

### **Remuneraciones**
```bash
GET http://localhost:8088/api/v1/remuneraciones

POST http://localhost:8088/api/v1/remuneraciones
Body:
{
  "nombreEmpleado": "Juan Pérez",
  "salarioBase": 800000,
  "bonificacion": 100000,
  "descuentos": 50000,
  "fechaPago": "2026-05-15",
  "estado": "Pendiente",
  "descripcion": "Sueldo mayo"
}
```

---

## 📚 **Estructura de Carpetas**

```
Fullstack-Proyecto/
├── EurekaServer/
│   ├── pom.xml
│   ├── src/main/java/cl/duoc/EurekaServer/
│   │   └── EurekaServerApplication.java
│   └── src/main/resources/
│       └── application.yml
├── Reembolsos/
│   ├── pom.xml
│   └── src/...
├── Remuneraciones/
│   ├── pom.xml
│   └── src/...
├── Usuario/
├── Producto/
├── Busqueda/
├── Notificaciones/
└── README.md
```

---

## 🤝 **Contribuir**

1. Crea una rama para tu microservicio
2. Desarrolla tu funcionalidad
3. Haz commit con mensajes claros
4. Push a tu rama
5. Crea un Pull Request a `main`

---

## ⚡ **Troubleshooting**

### **Error: Connection refused en Eureka**
```
Asegúrate de que Eureka Server está ejecutándose en puerto 8761
mvn spring-boot:run -Dspring.jpa.hibernate.ddl-auto=update
```

### **Error: Base de datos no existe**
```sql
CREATE DATABASE nombre_db CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;
```

### **Error: Puerto ya está en uso**
```bash
# Encontrar el proceso usando el puerto (ejemplo: 8085)
lsof -i :8085  # En Linux/Mac
netstat -ano | findstr :8085  # En Windows

# Matar el proceso
kill -9 <PID>  # En Linux/Mac
taskkill /PID <PID> /F  # En Windows
```

---

## 📞 **Contacto y Soporte**

- **Diego:** [@DiegoK2002](https://github.com/DiegoK2002)
- **Joaquín:** [@Joacolox205](https://github.com/Joacolox205)

---

**Última actualización:** Junio 2026
