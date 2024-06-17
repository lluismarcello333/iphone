# iphone - Documentação
## Sumário
1. (Visão Geral)[##visão-geral]
2. Diagrama UML
3. Estrutura do Projeto
4. Detalhes das Classes e Interfaces
5. Instruções para Compilação e Execução
6. Exemplo de Uso
7. Contribuindo

## Visão Geral
Este projeto simula as funcionalidades básicas de um iPhone, incluindo aplicativos como iPod, Phone, Internet (com suas subcategorias como Email, Navegador, GoogleMaps, Widgets, WiFi), Camera, SMS e Fotos. As classes e interfaces são implementadas em Java e seguem um diagrama UML para organização.

Este projeto é um desafio proposto pelo bootcamp Santander, baseado no vídeo de lançamento do iPhone de 2007. Você pode assistir ao vídeo [aqui](https://www.youtube.com/watch?v=9ou608QQRq8&ab_channel=TuchilaRino).

## Diagrama UML
![image](https://github.com/lluismarcello333/iphone/assets/98034550/d2f1bad7-639c-47fa-be3e-4e32b1964e27)

## Estrutura do Projeto
```
iphone-project/
│
├── src/
│   ├── Aplicativo.java
│   ├── iPhone.java
│   ├── iPod.java
│   ├── Phone.java
│   ├── Internet.java
│   ├── Email.java
│   ├── Navegador.java
│   ├── GoogleMaps.java
│   ├── Widgets.java
│   ├── WiFi.java
│   ├── Camera.java
│   ├── SMS.java
│   └── Fotos.java
│
├── docs/
│   └── diagrama-uml.png
│
└── README.md
```

## Detalhes das Classes e Interfaces

### Aplicativo,java
Interface base para todos os aplicativos do iPhone.
```
public interface Aplicativo {
    void abrir();
    void sair();
}
```
### iPhone.java
Classe principal que simula as funcionalidades básicas do iPhone.
```
public class iPhone {
    public void ligar() { ... }
    public void desligar() { ... }
    public void desbloquear() { ... }
    public void abrirIpod() { ... }
    public void abrirPhone() { ... }
    public void abrirInternet() { ... }
    public void abrirCamera() { ... }
    public void abrirSMS() { ... }
    public void abrirFotos() { ... }
    public void irParaHome() { ... }
    public void aumentarVolume() { ... }
    public void diminuirVolume() { ... }
    
    public static void main(String[] args) { ... }
}
```
### iPod.java
Implementa funcionalidades específicas do iPod.
```
public class iPod implements Aplicativo {
    public void abrirListaDeMusica() { ... }
    public void selecionarMusica() { ... }
    public void tocarMusica() { ... }
    public void mudarModoDeExibicao() { ... }
    public void aumentarVolume() { ... }
    public void diminuirVolume() { ... }
    public void selecionarVideo() { ... }
    public void reproduzirVideo() { ... }
    public void pausar() { ... }
    public void acelerarMidia() { ... }
    public void abrir() { ... }
    public void sair() { ... }
}
```
### Phone.java
Implementa funcionalidades específicas do Phone.
```
public class Phone implements Aplicativo {
    public void favoritos() { ... }
    public void recentes() { ... }
    public void contatos() { ... }
    public void teclado() { ... }
    public void correioDeVoz() { ... }
    public void ligarParaContato() { ... }
    public void atenderLigacao() { ... }
    public void recusarLigacao() { ... }
    public void selecionarContato() { ... }
    public void vivaVoz() { ... }
    public void colocarChamadaEmEspera() { ... }
    public void desligarLigacao() { ... }
    public void abrir() { ... }
    public void sair() { ... }
}
```
### Internet.java
Classe base para todas as subcategorias de Internet.
```
public class Internet implements Aplicativo {
    public void abrirEmail() { ... }
    public void abrirNavegador() { ... }
    public void abrirGoogleMaps() { ... }
    public void abrirWidgets() { ... }
    public void abrirWiFi() { ... }
    public void abrir() { ... }
    public void sair() { ... }
}
```
### Email.java
Implementa funcionalidades específicas do Email.
```
public class Email implements Aplicativo {
    public void enviarEmail() { ... }
    public void lerEmail() { ... }
    public void deletarEmail() { ... }
    public void responderEmail() { ... }
    public void encaminharEmail() { ... }
    public void abrir() { ... }
    public void sair() { ... }
}
```
### Navegador.java
Implementa funcionalidades específicas do Navegador.
```
public class Navegador implements Aplicativo {
    public void abrirPagina() { ... }
    public void atualizarPagina() { ... }
    public void adicionarAosFavoritos() { ... }
    public void abrirFavoritos() { ... }
    public void abrir() { ... }
    public void sair() { ... }
}
```
### GoogleMaps.java
Implementa funcionalidades específicas do GoogleMaps.
```
public class GoogleMaps implements Aplicativo {
    public void buscarLocal() { ... }
    public void tracaRota() { ... }
    public void salvarLocal() { ... }
    public void compartilharLocal() { ... }
    public void abrir() { ... }
    public void sair() { ... }
}
```
### Widgets.java
Implementa funcionalidades específicas dos Widgets.
```
public class Widgets implements Aplicativo {
    public void adicionarWidget() { ... }
    public void removerWidget() { ... }
    public void atualizarWidget() { ... }
    public void configurarWidget() { ... }
    public void abrir() { ... }
    public void sair() { ... }
}
```
### WiFi.java
Implementa funcionalidades específicas do WiFi.
```
public class WiFi implements Aplicativo {
    public void conectar() { ... }
    public void desconectar() { ... }
    public void listarRedes() { ... }
    public void salvarRede() { ... }
    public void abrir() { ... }
    public void sair() { ... }
}
```
### Camera.java
Implementa funcionalidades específicas da Camera.
```
public class Camera implements Aplicativo {
    public void tirarFoto() { ... }
    public void gravarVideo() { ... }
    public void mudarModo() { ... }
    public void acessarGaleria() { ... }
    public void abrir() { ... }
    public void sair() { ... }
}
```
### SMS.java
Implementa funcionalidades específicas do SMS.
```
public class SMS implements Aplicativo {
    public void enviarMensagem() { ... }
    public void lerMensagem() { ... }
    public void deletarMensagem() { ... }
    public void abrir() { ... }
    public void sair() { ... }
}
```
### Fotos.java
Implementa funcionalidades específicas do Fotos.
```
public class Fotos implements Aplicativo {
    public void visualizarFoto() { ... }
    public void deletarFoto() { ... }
    public void compartilharFoto() { ... }
    public void editarFoto() { ... }
    public void abrir() { ... }
    public void sair() { ... }
}
```

## Instruções para Compilação e Execução
### 1. Clone o repositório
```
git clone https://github.com/usuario/iphone-project.git
cd iphone-project
```
### 2. Compile os arquivos Java
```
javac src/*.java
```
### 3. Execute o programa principal
```
java -cp src iPhone
```

## Exemplo de Uso
O método main na classe iPhone demonstra como usar as várias funcionalidades implementadas. Ao executar o programa, você verá a sequência de ações impressas no console.

## Contribuindo
Para contribuir com este projeto, siga os passos abaixo:
1. Fork o repositório
2. Crie uma branch para sua feature ou correção de bug (git checkout -b feature/nome-da-feature)
3. Faça o commit das suas mudanças (git commit -m 'feat: adicionar nova funcionalidade')
4. Envie para o branch original (git push origin feature/nome-da-feature)
5. Crie um Pull Request
