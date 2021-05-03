package com.henriquemoreira.service;

public class LanceNaoEncontradoException extends RuntimeException{
	private static final long serialVersionUID = 1L;

	public LanceNaoEncontradoException(Integer id) {
		super("O item " + id + " não foi encontrado");
	}
}
