# gwt-mmvp

[![Build Status](https://secure.travis-ci.org/realityforge/gwt-mmvp.svg?branch=master)](http://travis-ci.org/realityforge/gwt-mmvp)
[<img src="https://img.shields.io/maven-central/v/org.realityforge.gwt.mmvp/gwt-mmvp.svg?label=latest%20release"/>](http://search.maven.org/#search%7Cga%7C1%7Cg%3A%22org.realityforge.gwt.mmvp%22%20a%3A%22gwt-mmvp%22)

A micro MVP library that enhances the Activities and Places library.

## Quick Start

The simplest way to use the library is to add the following dependency
into the build system. i.e.

```xml
<dependency>
   <groupId>org.realityforge.gwt.mmvp</groupId>
   <artifactId>gwt-mmvp</artifactId>
   <version>0.11</version>
   <scope>provided</scope>
</dependency>
```

Then you add the following snippet into the .gwt.xml file.

```xml
<module rename-to='myapp'>
  ...

  <!-- Enable the mmvp library -->
  <inherits name="org.realityforge.gwt.mmvp.MMVP"/>
</module>
```
