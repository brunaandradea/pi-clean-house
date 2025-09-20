-- =========== 1. DADOS BASE (ENTIDADES INDEPENDENTES) ===========

-- Inserindo 5 Endereços
INSERT INTO Enderecos (rua, numero, complemento, bairro, cidade, estado, cep, latitude, longitude) VALUES ('Rua das Flores', 123, 'Apto 202', 'Jardim das Rosas', 'São Paulo', 'SP', '01234-567', -23.550520, -46.633308);
INSERT INTO Enderecos (rua, numero, complemento, bairro, cidade, estado, cep, latitude, longitude) VALUES ('Avenida Brasil', 4567, NULL, 'Centro', 'Rio de Janeiro', 'RJ', '20040-002', -22.906847, -43.172896);
INSERT INTO Enderecos (rua, numero, complemento, bairro, cidade, estado, cep, latitude, longitude) VALUES ('Rua XV de Novembro', 89, 'Casa 1', 'Boa Vista', 'Curitiba', 'PR', '80020-310', -25.428954, -49.267137);
INSERT INTO Enderecos (rua, numero, complemento, bairro, cidade, estado, cep, latitude, longitude) VALUES ('Travessa da Serra', 77, NULL, 'Vila Nova', 'Porto Alegre', 'RS', '90460-100', -30.034647, -51.217658);
INSERT INTO Enderecos (rua, numero, complemento, bairro, cidade, estado, cep, latitude, longitude) VALUES ('Alameda Santos', 1345, 'Conjunto B', 'Bela Vista', 'São Paulo', 'SP', '01310-100', -23.561684, -46.655981);

-- Inserindo 5 Serviços oferecidos
INSERT INTO Servicos (nome, descricao, categoria) VALUES ('Faxina Residencial Padrão', 'Limpeza completa em residências, até 80m²', 'Serviços Domésticos');
INSERT INTO Servicos (nome, descricao, categoria) VALUES ('Faxina Pesada Pós-Obra', 'Limpeza detalhada para remoção de resíduos de construção', 'Serviços Especiais');
INSERT INTO Servicos (nome, descricao, categoria) VALUES ('Organização de Armários', 'Organização e otimização de espaços em guarda-roupas e armários de cozinha', 'Organização');
INSERT INTO Servicos (nome, descricao, categoria) VALUES ('Passadoria de Roupas', 'Serviço de passar roupas por hora', 'Serviços Domésticos');
INSERT INTO Servicos (nome, descricao, categoria) VALUES ('Cozinheira Diarista', 'Preparo de refeições para o dia ou semana', 'Serviços Domésticos');

-- =========== 2. USUÁRIOS (CLIENTES E EMPREGADAS) ===========

-- Inserindo 5 Clientes, cada um associado a um endereço
INSERT INTO Clientes (nome, cpf, email, telefone, dataCadastro, ulimaAtualizacao, atualizadoPor, endereco_id) VALUES ('João Silva', '123.456.789-00', 'joao.silva@email.com', '(11) 91234-5678', '2025-05-10', '2025-09-15 14:32:10', 'admin', 1);
INSERT INTO Clientes (nome, cpf, email, telefone, dataCadastro, ulimaAtualizacao, atualizadoPor, endereco_id) VALUES ('Maria Oliveira', '987.654.321-00', 'maria.oliveira@email.com', '(21) 99876-5432', '2025-06-22', '2025-09-16 09:15:45', 'usuario1', 2);
INSERT INTO Clientes (nome, cpf, email, telefone, dataCadastro, ulimaAtualizacao, atualizadoPor, endereco_id) VALUES ('Carlos Pereira', '321.987.654-00', 'carlos.pereira@email.com', '(31) 93456-7890', '2025-07-01', '2025-09-17 11:00:00', 'usuario2', 3);
INSERT INTO Clientes (nome, cpf, email, telefone, dataCadastro, ulimaAtualizacao, atualizadoPor, endereco_id) VALUES ('Ana Costa', '456.123.789-00', 'ana.costa@email.com', '(41) 97654-3210', '2025-08-10', '2025-09-17 13:25:30', 'admin', 4);
INSERT INTO Clientes (nome, cpf, email, telefone, dataCadastro, ulimaAtualizacao, atualizadoPor, endereco_id) VALUES ('Lucas Martins', '654.321.987-00', 'lucas.martins@email.com', '(51) 98888-7777', '2025-09-05', '2025-09-17 16:45:00', 'usuario3', 5);

-- Inserindo 5 Empregadas (ID 4 está inativa)
INSERT INTO Empregadas (nome, cpf, email, telefone, endereco, descricao, data_nascimento, data_cadastro, status, ultima_atualizacao, atualizado_por) VALUES ('Ana Paula', '111.222.333-44', 'ana.paula@email.com', '11911112222', 'Rua das Flores, 10', 'Especialista em limpeza pesada.', '1990-05-15', '2025-09-01', true, '2025-09-01 10:00:00', 'admin');
INSERT INTO Empregadas (nome, cpf, email, telefone, endereco, descricao, data_nascimento, data_cadastro, status, ultima_atualizacao, atualizado_por) VALUES ('Beatriz Costa', '222.333.444-55', 'beatriz.costa@email.com', '11922223333', 'Avenida Central, 20', 'Experiência com pets e crianças.', '1988-11-20', '2025-09-02', true, '2025-09-02 11:30:00', 'admin');
INSERT INTO Empregadas (nome, cpf, email, telefone, endereco, descricao, data_nascimento, data_cadastro, status, ultima_atualizacao, atualizado_por) VALUES ('Carla Dias', '333.444.555-66', 'carla.dias@email.com', '11933334444', 'Praça da Matriz, 30', 'Foco em organização de armários.', '1995-02-10', '2025-09-03', true, '2025-09-03 14:00:00', 'admin');
INSERT INTO Empregadas (nome, cpf, email, telefone, endereco, descricao, data_nascimento, data_cadastro, status, ultima_atualizacao, atualizado_por) VALUES ('Daniela Rocha', '444.555.666-77', 'daniela.rocha@email.com', '11944445555', 'Rua do Sol, 40', 'Limpeza de escritórios e pós-obra.', '1992-07-30', '2025-09-04', false, '2025-09-04 09:00:00', 'admin');
INSERT INTO Empregadas (nome, cpf, email, telefone, endereco, descricao, data_nascimento, data_cadastro, status, ultima_atualizacao, atualizado_por) VALUES ('Eduarda Lima', '555.666.777-88', 'eduarda.lima@email.com', '11955556666', 'Travessa da Lua, 50', 'Serviços gerais e jardinagem leve.', '1998-09-05', '2025-09-05', true, '2025-09-05 16:45:00', 'admin');

-- =========== 3. DADOS DE RELACIONAMENTO E EVENTOS ===========

-- Disponibilidade das empregadas ativas
INSERT INTO Disponibilidade (dia_semana, hora_inicio, hora_fim, empregadas_id) VALUES ('Segunda-feira', '08:00:00', '12:00:00', 6);
INSERT INTO Disponibilidade (dia_semana, hora_inicio, hora_fim, empregadas_id) VALUES ('Terça-feira', '09:00:00', '18:00:00', 8);
INSERT INTO Disponibilidade (dia_semana, hora_inicio, hora_fim, empregadas_id) VALUES ('Quarta-feira', '13:00:00', '17:00:00', 7);
INSERT INTO Disponibilidade (dia_semana, hora_inicio, hora_fim, empregadas_id) VALUES ('Sexta-feira', '08:00:00', '16:00:00', 10);
INSERT INTO Disponibilidade (dia_semana, hora_inicio, hora_fim, empregadas_id) VALUES ('Sábado', '09:00:00', '13:00:00', 9);

-- Contratações com status e valores diferentes (ID 4 foi cancelada pois a empregada está inativa)
INSERT INTO Contratacoes (data_contratacao, data_servico, hora_inicio, horas_contratadas, valor_total, status, ultima_atualizacao, empregadas_id, clientes_id, servicos_id) VALUES ('2025-09-10', '2025-09-15', '09:00:00', 7, 150.00, 'AGENDADO', '2025-09-10 14:20:00', 1, 1, 1);
INSERT INTO Contratacoes (data_contratacao, data_servico, hora_inicio, horas_contratadas, valor_total, status, ultima_atualizacao, empregadas_id, clientes_id, servicos_id) VALUES ('2025-09-11', '2025-09-18', '14:00:00', 8, 280.50, 'AGENDADO', '2025-09-11 10:00:00', 2, 2, 2);
INSERT INTO Contratacoes (data_contratacao, data_servico, hora_inicio, horas_contratadas, valor_total, status, ultima_atualizacao, empregadas_id, clientes_id, servicos_id) VALUES ('2025-09-12', '2025-09-20', '10:00:00', 6, 200.00, 'CONCLUIDO', '2025-09-20 17:00:00', 3, 3, 3);
INSERT INTO Contratacoes (data_contratacao, data_servico, hora_inicio, horas_contratadas, valor_total, status, ultima_atualizacao, empregadas_id, clientes_id, servicos_id) VALUES ('2025-09-13', '2025-09-22', '08:00:00', 9, 160.00, 'CANCELADO', '2025-09-15 09:00:00', 4, 4, 1);
INSERT INTO Contratacoes (data_contratacao, data_servico, hora_inicio, horas_contratadas, valor_total, status, ultima_atualizacao, empregadas_id, clientes_id, servicos_id) VALUES ('2025-09-14', '2025-09-25', '13:00:00', 10, 180.75, 'AGENDADO', '2025-09-14 11:45:00', 5, 5, 4);

-- Pagamentos com valores CORRIGIDOS para bater com as contratações
INSERT INTO Pagamentos (valor, metodoPagamento, status, data_pagamento, comprovante_url, contratacoes_id) VALUES (150.00, 'Cartão de Crédito', 'APROVADO', '2025-09-10', 'https://exemplo.com/comprovante1.jpg', 1);
INSERT INTO Pagamentos (valor, metodoPagamento, status, data_pagamento, comprovante_url, contratacoes_id) VALUES (280.50, 'Boleto', 'PENDENTE', '2025-09-11', 'https://exemplo.com/comprovante2.jpg', 2);
INSERT INTO Pagamentos (valor, metodoPagamento, status, data_pagamento, comprovante_url, contratacoes_id) VALUES (200.00, 'Pix', 'APROVADO', '2025-09-20', 'https://exemplo.com/comprovante3.jpg', 3);
INSERT INTO Pagamentos (valor, metodoPagamento, status, data_pagamento, comprovante_url, contratacoes_id) VALUES (160.00, 'Cartão de Débito', 'ESTORNADO', '2025-09-13', 'https://exemplo.com/comprovante4.jpg', 4);
INSERT INTO Pagamentos (valor, metodoPagamento, status, data_pagamento, comprovante_url, contratacoes_id) VALUES (180.75, 'Transferência Bancária', 'PENDENTE', '2025-09-14', 'https://exemplo.com/comprovante5.jpg', 5);

-- Mensagens relacionadas às contratações
INSERT INTO Mensagens (mensagem, data_envio, status, contratacoes_id) VALUES ('Olá! Confirmando o serviço para o dia 15. Levo meus próprios produtos.', '2025-09-10 15:00:00', true, 1);
INSERT INTO Mensagens (mensagem, data_envio, status, contratacoes_id) VALUES ('Tudo certo para quinta-feira. O endereço é o mesmo do cadastro?', '2025-09-11 11:00:00', true, 2);
INSERT INTO Mensagens (mensagem, data_envio, status, contratacoes_id) VALUES ('Serviço finalizado com sucesso! Muito obrigado pela confiança.', '2025-09-20 16:50:00', true, 3);
INSERT INTO Mensagens (mensagem, data_envio, status, contratacoes_id) VALUES ('Gostaria de reagendar o serviço do dia 25, se possível.', '2025-09-14 12:00:00', false, 5);
INSERT INTO Mensagens (mensagem, data_envio, status, contratacoes_id) VALUES ('Recebi a confirmação. Até o dia 15!', '2025-09-10 15:05:00', true, 1);

-- Notificações com datas e eventos consistentes
INSERT INTO Notificacoes (tipo_notificacao, mensagem, data_notificacao, status, empregadas_id, clientes_id) VALUES ('NOVA_CONTRATACAO', 'Você tem um novo serviço agendado para o dia 15/09.', '2025-09-10 14:21:00', 'NAO_LIDA', 8, NULL);
INSERT INTO Notificacoes (tipo_notificacao, mensagem, data_notificacao, status, empregadas_id, clientes_id) VALUES ('LEMBRETE_SERVICO', 'Seu serviço com Beatriz Costa é amanhã!', '2025-09-17 09:00:00', 'LIDA', 9, 2);
INSERT INTO Notificacoes (tipo_notificacao, mensagem, data_notificacao, status, empregadas_id, clientes_id) VALUES ('SERVICO_CONCLUIDO', 'O seu serviço com Carla Dias foi marcado como concluído.', '2025-09-20 17:01:00', 'NAO_LIDA', 7, 3);
INSERT INTO Notificacoes (tipo_notificacao, mensagem, data_notificacao, status, empregadas_id, clientes_id) VALUES ('CONTRATACAO_CANCELADA', 'A contratação para o dia 22/09 foi cancelada (profissional indisponível).', '2025-09-15 09:02:00', 'LIDA', 6, 4);
INSERT INTO Notificacoes (tipo_notificacao, mensagem, data_notificacao, status, empregadas_id, clientes_id) VALUES ('PAGAMENTO_APROVADO', 'Seu pagamento de R$ 200,00 para o serviço do dia 20/09 foi aprovado.', '2025-09-20 18:00:00', 'NAO_LIDA', 10, 3);

-- Avaliações apenas para o serviço CONCLUÍDO (Contratação 3)
INSERT INTO Avaliacoes (tipo_avaliacao, nota, comentario, data_avaliacao, empregadas_id, clientes_id, contratacoes_id) VALUES ('SERVICO', 5, 'A Carla foi fantástica! Muito detalhista e profissional. Recomendo!', '2025-09-21 11:00:00', 7, 8, 5);
INSERT INTO Avaliacoes (tipo_avaliacao, nota, comentario, data_avaliacao, empregadas_id, clientes_id, contratacoes_id) VALUES ('PONTUALIDADE', 5, 'Chegou no horário combinado.', '2025-09-21 11:01:00', 6, 9, 5);
INSERT INTO Avaliacoes (tipo_avaliacao, nota, comentario, data_avaliacao, empregadas_id, clientes_id, contratacoes_id) VALUES ('COMUNICACAO', 4, 'A comunicação foi boa, mas poderia ter respondido um pouco mais rápido.', '2025-09-21 11:02:00', 10, 8, 3);
INSERT INTO Avaliacoes (tipo_avaliacao, nota, comentario, data_avaliacao, empregadas_id, clientes_id, contratacoes_id) VALUES ('CUSTO_BENEFICIO', 5, 'O preço foi justo pela qualidade do serviço prestado.', '2025-09-21 11:03:00', 9, 7, 5);
INSERT INTO Avaliacoes (tipo_avaliacao, nota, comentario, data_avaliacao, empregadas_id, clientes_id, contratacoes_id) VALUES ('GERAL', 5, 'Excelente experiência, com certeza contratarei novamente.', '2025-09-21 11:04:00', 10, 6, 2);