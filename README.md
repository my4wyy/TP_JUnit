## TP_JUNIT

# 1. Framework JUnit

O *JUnit* é um framework de testes unitários para Java, criado em 1997 por *Erich Gamma* e *Kent Beck. Ele faz parte da família de frameworks de teste conhecidos como **xUnit, usados em várias linguagens de programação. O JUnit é considerado um dos pilares do **Desenvolvimento Orientado a Testes (TDD)* e da *Integração Contínua (CI)*, pois possibilita a automação e repetição de testes de forma rápida e confiável.  

Atualmente, a versão mais utilizada é o *JUnit 5 (JUnit Jupiter)*, que introduziu uma arquitetura modular, suporte aprimorado para anotações e maior flexibilidade na execução dos testes.  

Entre os recursos mais relevantes, destacam-se:  
- *Anotações:* @Test, @BeforeEach, @AfterEach, @BeforeAll, @AfterAll.  
- *Assertivas:* métodos como assertEquals, assertTrue, assertThrows, que validam os resultados esperados.  
- *Integração:* funciona de forma nativa com ferramentas de build como *Maven* e *Gradle*, além de se integrar facilmente a IDEs (Eclipse, IntelliJ, VS Code).  
- *Feedback rápido:* relatórios de execução de testes claros, permitindo verificar quais testes passaram ou falharam.  
- *Manutenção da qualidade:* garante que novas mudanças no código não quebrem funcionalidades já implementadas (testes de regressão).  

Graças a essas características, o JUnit se tornou padrão de mercado para testes em Java, sendo utilizado tanto em projetos acadêmicos quanto em sistemas corporativos de larga escala.  

---

# 2. Categorização do Framework

## i) Técnicas de Teste
O JUnit se encaixa principalmente em *testes de caixa branca*, pois normalmente o desenvolvedor tem conhecimento do código-fonte ao escrever os testes.  

## ii) Níveis de Teste
O JUnit é mais utilizado em *teste de unidade, validando métodos e classes individualmente. No entanto, também pode ser estendido para **testes de integração, especialmente quando combinado com bibliotecas de simulação (*mocks).  

## iii) Tipos de Teste
O JUnit cobre:  
- *Testes funcionais:* garante que os métodos realizem corretamente suas operações.  
- *Testes de regressão:* sempre que o código muda, os testes podem ser reexecutados para verificar se nada foi quebrado.  
- *Testes automatizados:* facilitando a repetição sem intervenção manual.  

---

# 3. Instalação/Integração

### Maven – pom.xml
xml
<dependency>
  <groupId>org.junit.jupiter</groupId>
  <artifactId>junit-jupiter</artifactId>
  <version>5.10.0</version>
  <scope>test</scope>
</dependency>


### Gradle – build.gradle
xml
testImplementation 'org.junit.jupiter:junit-jupiter:5.10.0'


Em IDEs modernas, basta criar o projeto Java com suporte a testes e adicionar a dependência para começar.

---

# 4. Estratégia de Teste e Casos Derivados

Foi aplicada a estratégia de *Particionamento de Equivalência, dividindo entradas em classes válidas e inválidas. Também foram considerados **valores-limite*, que testam extremos importantes (como zero e números negativos).  

### Casos de Teste Derivados para a Calculadora
- Soma de dois números positivos.  
- Soma envolvendo número zero.  
- Soma de números negativos.  
- Subtração de dois números positivos.  
- Subtração envolvendo número negativo.  
- Multiplicação de dois números positivos.  
- Multiplicação por zero.  
- Multiplicação envolvendo número negativo.
