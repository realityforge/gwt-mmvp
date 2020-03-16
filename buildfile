require 'buildr/git_auto_version'
require 'buildr/gpg'
require 'buildr/gwt'

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
  pom.provided_dependencies.concat [:javax_annotation, :findbugs_annotations]

  compile.with :javax_annotation,
               :findbugs_annotations,
               :gwt_user

  package(:jar).include("#{_(:source, :main, :java)}/*")
  package(:sources)
  package(:javadoc)

  gwt(%w(org.realityforge.gwt.mmvp.ioc.Gin org.realityforge.gwt.mmvp.MMVP),
      :java_args => %w(-Xms512M -Xmx1024M),
      :draft_compile => 'true') unless ENV['GWT'] == 'no'

  ipr.add_component_from_artifact(:idea_codestyle)

  iml.add_gwt_facet({ 'org.realityforge.gwt.mmvp.MMVP' => false },
                    :settings => { :compilerMaxHeapSize => '1024' },
                    :gwt_dev_artifact => :gwt_dev)
  iml.add_jruby_facet
end
