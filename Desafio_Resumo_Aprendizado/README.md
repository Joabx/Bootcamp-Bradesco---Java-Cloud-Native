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

## 🌐 Componentes da Arquitetura do Azure  

### 🗺️ Regiões  
- Conjuntos de um ou mais datacenters localizados próximos fisicamente, garantindo baixa latência para os usuários finais.  
- Oferecem escalabilidade e flexibilidade para suportar aplicações globais com alta performance.  
- Garantem a **residência dos dados** para atender requisitos legais e de conformidade em diferentes países ou setores.  
- Cada região tem suas próprias políticas de compliance, incluindo padrões como GDPR, HIPAA, ISO 27001, entre outros, garantindo conformidade internacional.  

### 🏢 Zonas de Disponibilidade  
- São datacenters independentes dentro da mesma região, distribuídos geograficamente para maior resiliência.  
- Cada zona possui infraestrutura própria de energia, refrigeração e rede, protegendo contra falhas pontuais.  
- Permitem arquiteturas de alta disponibilidade, minimizando riscos de indisponibilidade por falhas físicas.  
- Para aplicações críticas, recomenda-se distribuir recursos entre zonas diferentes para garantir tolerância a falhas e continuidade do serviço.  

### 🔗 Pares de Regiões  
- Regiões emparelhadas ficam separadas por pelo menos **300 milhas (aprox. 480 km)** para evitar impactos simultâneos por desastres naturais.  
- Suportam **replicação automática** de dados e serviços, aumentando a tolerância a falhas.  
- Recebem prioridade na recuperação após interrupções, agilizando o restabelecimento dos serviços.  
- Atualizações de software e manutenção são feitas de forma escalonada para reduzir o tempo de indisponibilidade.  
- Essa arquitetura ajuda a implementar estratégias de recuperação de desastre (Disaster Recovery - DR) eficientes.  

### 🏛️ Regiões Soberanas do Azure  
Regiões específicas para clientes com requisitos regulatórios rigorosos:  

#### 🇺🇸 Serviços Governamentais dos EUA  
- Projetados para agências federais, estaduais e locais americanas, cumprindo rigorosas normas de segurança e compliance.  
- Suportam certificações específicas como FedRAMP, DoD SRG, garantindo segurança para dados sensíveis do governo.  

#### 🛡️ Azure Governamental  
- Ambiente dedicado e isolado fisicamente do Azure comercial, restrito a pessoal autorizado e verificado.  
- Oferece serviços similares ao Azure comercial, mas com controles adicionais para segurança e conformidade governamental.  

#### 🇨🇳 Azure China  
- Operado pela 21Vianet, é uma instância separada para atender as exigências legais chinesas, mantendo os dados localizados dentro do país.  
- A conformidade com regulamentos locais chineses como o CSL (Cybersecurity Law) é uma característica fundamental.  

---

## ⚙️ Recursos Essenciais do Azure  

Os recursos do Azure são os blocos básicos para construir soluções em nuvem:  
- 💻 Máquinas Virtuais (VMs): máquinas completas que podem rodar qualquer sistema operacional, usadas para workloads variados.  
- 📦 Contas de Armazenamento: fornecem armazenamento escalável para dados não estruturados, arquivos, tabelas e filas.  
- 🌐 Redes Virtuais (VNet): criam redes isoladas para comunicação segura entre recursos e com a internet.  
- 🛠️ Serviços de Aplicativos: plataforma gerenciada para desenvolvimento e hospedagem de aplicações web, APIs e back-ends.  
- 🗄️ Banco de Dados SQL: serviço gerenciado para banco de dados relacional, com alta disponibilidade e backups automáticos.  
- ⚡ Azure Functions (funções serverless): executam código sob demanda, cobrando apenas pelo tempo de execução, facilitando arquiteturas event-driven.  

---

## 📦 Grupos de Recursos  

- Servem como contêineres para organizar e gerenciar recursos relacionados como uma única entidade lógica.  
- Cada recurso pode pertencer a somente um grupo de recursos, garantindo organização e controle.  
- Recursos em um grupo podem estar distribuídos em diferentes regiões geográficas.  
- É possível **mover recursos** entre grupos para facilitar a reorganização da infraestrutura, mesmo em produção, com downtime mínimo.  
- Aplicações complexas podem utilizar vários grupos para separar ambientes (desenvolvimento, teste, produção), times ou projetos.  
- Grupos de recursos facilitam a aplicação de políticas e controle de acesso granular usando Azure RBAC (Role-Based Access Control).  

---

## 🔑 Assinaturas do Azure  

- Uma conta pode ter várias assinaturas, que funcionam como fronteiras administrativas e de cobrança.  
- Cada assinatura fornece acesso autenticado e autorizado aos recursos e serviços do Azure, garantindo segurança no uso.  
- As assinaturas isolam recursos, facilitando gestão financeira, limites de serviço e permissões específicas para diferentes equipes ou projetos.  

### ⚠️ Limites das Assinaturas  
- **Cobrança**: Cada assinatura gera relatórios e faturas individualizados para melhor controle financeiro.  
- **Controle de Acesso**: As políticas definem quem pode criar, alterar ou excluir recursos dentro da assinatura.  
- Permite implementar separação entre ambientes de desenvolvimento, teste e produção para maior governança.  

---

## 🗂️ Grupos de Gerenciamento  

- Permitem agrupar várias assinaturas sob uma única unidade administrativa para facilitar o controle e a aplicação de políticas.  
- As assinaturas dentro de um grupo herdam as regras e condições configuradas no grupo, promovendo governança centralizada e padronização.  
- Suportam a aplicação de políticas globais via Azure Policy, permitindo regras de compliance e segurança em larga escala.  
- Facilitam a delegação de administração e automação de governança em organizações grandes e com múltiplas equipes.  
