package com.nhl.bootique.mvc.mustache;

import java.io.Writer;

import com.nhl.bootique.mvc.Template;
import com.nhl.bootique.mvc.renderer.TemplateRenderer;

public class MustacheTemplateRenderer implements TemplateRenderer {

	@Override
	public void render(Writer out, Template template, Object rootModel) {
		throw new UnsupportedOperationException("TODO");
	}
}
