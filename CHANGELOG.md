# Change Log

### [v0.15](https://github.com/realityforge/gwt-mmvp/tree/v0.15) (2020-09-16) · [Full Changelog](https://github.com/realityforge/gwt-mmvp/compare/v0.14...v0.15)

* Add a `MvpActivity.isActive()` method to determine whether an activity is "active" (i.e. start has been invoked but
  neither `onStop` nor `onCancel` has been invoked.)

### [v0.14](https://github.com/realityforge/gwt-mmvp/tree/v0.14) (2020-09-11) · [Full Changelog](https://github.com/realityforge/gwt-mmvp/compare/v0.12...v0.14)

* Add `PlaceAwareActivity` to make it easy for activities to gain access to place that activated activity.
* Bump the version of gwt tested against to `2.9.0`
* Bump the version of the `org.realityforge.javax.annotation:javax.annotation` artifact to `1.0.1`

### [v0.12](https://github.com/realityforge/gwt-mmvp/tree/v0.12) (2020-03-16) · [Full Changelog](https://github.com/realityforge/gwt-mmvp/compare/v0.11..v0.12)

* Bump the version of gwt tested against to `2.8.2-v20191108`
* Convert gwt dependency into a "provided" dependency.
* Cleanup pom dependencies.

### [v0.11](https://github.com/realityforge/gwt-mmvp/tree/v0.11) (2020-03-16) · [Full Changelog](https://github.com/realityforge/gwt-mmvp/compare/v0.10..v0.11)

* Remove GIN/javax.inject/dagger integration.
* Merge `org.realityforge.gwt.mmvp.Base` into `org.realityforge.gwt.mmvp.MMVP` as there is no longer a valid use-case for separating them.
* Refactor `AbstractActivityMapper` to use `Supplier` interface rather than `javax.inject.Provider` interface.
* Add some nullability annotations to `AbstractActivityMapper`

### [v0.10](https://github.com/realityforge/gwt-mmvp/tree/v0.10) (2019-12-19) · [Full Changelog](https://github.com/realityforge/gwt-mmvp/compare/v0.9..v0.10)

* Introduce new GWT modules so that the library can be adopted without adopting GIN.

### [v0.9](https://github.com/realityforge/gwt-mmvp/tree/v0.9) (2017-05-10) · [Full Changelog](https://github.com/realityforge/gwt-mmvp/compare/v0.8...v0.9)

* Make `MvpActivity.getActivity()` method final.
* Enhance `MvpActivity` to add `onStart()` hook method to ease extensions from subclasses.
* Enhance `MvpActivity` to accept a view in the constructor and implement the `getView()` method.

### [v0.8](https://github.com/realityforge/gwt-mmvp/tree/v0.8) (2017-05-10) · [Full Changelog](https://github.com/realityforge/gwt-mmvp/compare/v0.7...v0.8)

* Add `PlaceHistoryHandler` component to those exposed by `MvpComponentsGinModule`.

### [v0.7](https://github.com/realityforge/gwt-mmvp/tree/v0.7) (2017-05-10) · [Full Changelog](https://github.com/realityforge/gwt-mmvp/compare/v0.6...v0.7)

* Add `ActivityManager` component to those exposed by `MvpComponentsGinModule`.

### [v0.6](https://github.com/realityforge/gwt-mmvp/tree/v0.6) (2017-05-09) · [Full Changelog](https://github.com/realityforge/gwt-mmvp/compare/v0.5...v0.6)

* Upgrade to JDK 8.
* Upgrade to GWT 2.8.
* Remove ActivityAsyncProxy as never used.
* Add `MvpComponentsGinModule` which has been copied back from downstream libraries.
* Add `AbstractMvpGinModule` which has been copied back from downstream libraries.
* Introduce `ActivityPresenter` to ensure that the implementations that are actually
  bound by gin are provided rather than direct implementation.

### [v0.5](https://github.com/realityforge/gwt-mmvp/tree/v0.5) (2014-01-13) · [Full Changelog](https://github.com/realityforge/gwt-mmvp/compare/v0.4...v0.5)

* Upgrade to JDK 7.
* Correct the group from org.realityforge.gwt.ga to org.realityforge.gwt.mmvp

### [v0.4](https://github.com/realityforge/gwt-mmvp/tree/v0.4) (2013-07-02) · [Full Changelog](https://github.com/realityforge/gwt-mmvp/compare/v0.3...v0.4)

* Introduce simple Presenter and View interfaces.

### [v0.3](https://github.com/realityforge/gwt-mmvp/tree/v0.3) (2013-07-02) · [Full Changelog](https://github.com/realityforge/gwt-mmvp/compare/v0.1...v0.3)

* Correct the GWT module.

### [v0.1](https://github.com/realityforge/gwt-mmvp/tree/v0.1) (2013-07-02) · [Full Changelog](https://github.com/realityforge/gwt-mmvp/compare/a77925957d9547706fd787905e35e1a86b3b598e...v0.1)

* Initial release
