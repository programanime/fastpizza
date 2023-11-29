# deploy
SET JAVA_HOME=A:\jdk-17-openjdk-17-35
SET "PATH=%JAVA_HOME%\bin;%PATH%"
nodemon --exec "mvn spring-boot:run" -e "java,properties,xml" -w .

# docker postgres
docker ps
docker run --name postgress -p 5432:5432 -e POSTGRES_PASSWORD=root -e PGPASSWORD=root -e POSTGRES_USER=root -d ananthhh/postgress
docker run -it --rm postgres psql -h 192.168.1.4 -U root
root

# installation process
npm install --save typescript @types/react @types/react-dom
cd webui
npx tsc --init
npm install react-router-dom
npm install react-router-dom
npm install axios
