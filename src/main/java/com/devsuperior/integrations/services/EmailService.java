package com.devsuperior.integrations.services;

import com.devsuperior.integrations.dto.EmailDTO;

public interface EmailService {
	void sendEmail(EmailDTO dto);
}
