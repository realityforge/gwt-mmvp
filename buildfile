require 'buildr/git_auto_version'
require 'buildr/gpg'

desc 'MMVP: Enhance the activities and places library'
define 'gwt-mmvp' do
  project.group = 'org.realityforge.gwt.mmvp'
  compile.options.source = '1.8'
  compile.options.target = '1.8'
  compile.options.lint = 'all'

  project.version = ENV['PRODUCT_VERSION'] if ENV['PRODUCT_VERSION']

  pom.add_apache_v2_license
  pom.add_github_project('realityforge/gwt-mmvp')
  pom.add_developer('realityforge', 'Peter Donald')
  pom.provided_dependencies.concat [:javax_annotation, :javax_inject, :javax_inject_sources]

  compile.with :javax_annotation,
               :gwt_user,
               :gwt_gin,
               :javax_inject,
               :javax_inject_sources

  package(:jar).include("#{_(:source, :main, :java)}/*")
  package(:sources)
  package(:javadoc)

  iml.add_jruby_facet
end
