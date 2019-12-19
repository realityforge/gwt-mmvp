## 0.10:
* Introduce new GWT modules so that the library can be adopted without adopting GIN.

## 0.9:
* Make `MvpActivity.getActivity()` method final.
* Enhance `MvpActivity` to add `onStart()` hook method to ease extensions from subclasses.
* Enhance `MvpActivity` to accept a view in the constructor and implement the `getView()` method.

## 0.8:
* Add `PlaceHistoryHandler` component to those exposed by `MvpComponentsGinModule`.

## 0.7:
* Add `ActivityManager` component to those exposed by `MvpComponentsGinModule`.

## 0.6:
* Upgrade to JDK 8.
* Upgrade to GWT 2.8.
* Remove ActivityAsyncProxy as never used.
* Add `MvpComponentsGinModule` which has been copied back from downstream libraries.
* Add `AbstractMvpGinModule` which has been copied back from downstream libraries.
* Introduce `ActivityPresenter` to ensure that the implementations that are actually
  bound by gin are provided rather than direct implementation.

## 0.5:
* Upgrade to JDK 7.
* Correct the group from org.realityforge.gwt.ga to org.realityforge.gwt.mmvp

## 0.4:

* Introduce simple Presenter and View interfaces.

## 0.3:

* Correct the GWT module.

## 0.1:

* Initial release
