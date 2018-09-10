package br.com.sis.pedidos.backend.services;

import org.springframework.mail.SimpleMailMessage;

import br.com.sis.pedidos.backend.domain.Pedido;

import javax.mail.internet.MimeMessage;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);

	void sendOrderConfirmationHtmlEmail(Pedido obj);

	void sendHtmlEmail(MimeMessage msg);
}