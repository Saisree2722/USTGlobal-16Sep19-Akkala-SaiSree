import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { SearchproductbyNameComponent } from './searchproductby-name.component';

describe('SearchproductbyNameComponent', () => {
  let component: SearchproductbyNameComponent;
  let fixture: ComponentFixture<SearchproductbyNameComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ SearchproductbyNameComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(SearchproductbyNameComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
