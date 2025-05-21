# RESUMO SOBRE APRENDIZADOS 🗒️

## ☁️ Benefícios da Nuvem Azure

- 🔄 **Alta Disponibilidade** – Serviços continuam ativos mesmo em falhas ou imprevistos.
- 📈 **Escalabilidade** – Ajuste de recursos sob demanda, pagando só pelo que usar.
- 🧬 **Elasticidade** – Expansão ou redução rápida e automática conforme a necessidade.
- 🛡️ **Confiabilidade** – Infraestrutura distribuída globalmente, resistente a falhas.
- 📊 **Previsibilidade** – Controle e estabilidade em desempenho e custos.
- 🔐 **Segurança** – Proteções avançadas + responsabilidades do cliente.
- 🧾 **Governança** – Conformidade e automação de atualizações com auditoria integrada.
- 🧰 **Gerenciabilidade** – Gestão facilitada por APIs, PowerShell e automações.


## 🔐 Entendendo o Modelo de Responsabilidade Compartilhada na Nuvem

Na computação em nuvem, a responsabilidade pela segurança, conformidade e gerenciamento da infraestrutura é compartilhada entre o cliente e o provedor do serviço. Essa divisão varia conforme o tipo de serviço utilizado, e entender essa dinâmica é fundamental para garantir a proteção adequada dos seus dados e aplicações.

- 🛠️ **Responsabilidades fixas do cliente**: Sempre cabe ao cliente controlar o acesso aos seus dados, garantir a segurança das informações e gerenciar configurações relacionadas à proteção dos recursos que utiliza na nuvem. Isso inclui gerenciamento de identidade, criptografia de dados e políticas de compliance.
- ⚖️ **Responsabilidades variáveis**: Dependendo do modelo de serviço (IaaS, PaaS ou SaaS), a divisão das tarefas entre cliente e provedor muda, com o provedor assumindo mais funções em serviços mais gerenciados.
- 🔄 **Delegação progressiva**: Serviços gerenciados reduzem a carga operacional do cliente, delegando a manutenção da infraestrutura, atualizações de segurança, backups e monitoramento para o provedor, permitindo que o cliente foque no uso e inovação.

## ☁️ Modelos de Serviço em Nuvem: Controle e Responsabilidade

### 🖥️ Infraestrutura como Serviço (IaaS)  
Oferece controle quase total sobre os recursos virtuais — servidores, redes, armazenamento — enquanto o provedor cuida da infraestrutura física. Você é responsável pela instalação, manutenção e segurança do sistema operacional, middleware, e suas aplicações.  
**Exemplo:** provisionar máquinas virtuais para rodar aplicativos personalizados, configurando firewall, redes virtuais e sistemas de backup.

### 🛠️ Plataforma como Serviço (PaaS)  
O provedor entrega uma plataforma pronta para o desenvolvimento, testes e implantação de aplicações, gerenciando toda a infraestrutura subjacente, sistemas operacionais e middleware. O cliente foca no desenvolvimento do software, gestão dos dados e segurança das aplicações.  
**Exemplo:** usar serviços gerenciados de banco de dados e hospedagem de aplicações web sem se preocupar com o sistema operacional ou atualizações.

### 📦 Software como Serviço (SaaS)  
Neste modelo, o provedor oferece o software completo pela internet, gerenciando tudo, desde infraestrutura até atualizações e segurança do software. O cliente consome o serviço via navegador ou app, focando no uso e na gestão das configurações de usuário.  
**Exemplo:** plataformas de colaboração, ferramentas de produtividade e armazenamento na nuvem, como Microsoft 365 e Google Workspace.

### 🧩 Por que é importante entender essa divisão?  
Saber onde sua responsabilidade começa e termina ajuda a evitar falhas de segurança causadas por configurações incorretas ou negligência no gerenciamento. Além disso, permite otimizar recursos, definir políticas claras de compliance e reduzir riscos operacionais, especialmente em ambientes regulados.

### ⚠️ Riscos comuns sem entendimento claro  
- Falta de controle no gerenciamento de identidades e acessos.  
- Configurações inseguras que expõem dados sensíveis.  
- Falta de atualização e patching de sistemas sob responsabilidade do cliente.  
- Falhas na segregação de dados entre diferentes ambientes ou clientes.

Conhecer o modelo de responsabilidade compartilhada é o primeiro passo para usar a nuvem com segurança, eficiência e alinhamento às necessidades do seu negócio.
